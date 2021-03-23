#!/bin/bash
set -x
assets=""
echo "Usage ./create_release.sh <branch> <release_name>"
REL=$2
BRANCH=$1
if [ $BRANCH = "eng" ]; then
    BRANCH="master"
fi

if [ -z $REL ]; then
    echo "Pl. give the release name eg. latest"
    exit 1
fi

export PYTHONPATH=`pwd`/python:$PYTHONPATH

REL_TAG=tag-$REL
git tag -d $REL_TAG
git tag -d $REL
git tag $REL_TAG
git push -f origin $REL_TAG
set -e
git checkout -B $BRANCH
AVI_VERSION=`python ./python/version.py`

if [ $AVI_VERSION != $REL ]; then
  echo 'Pip version incorrect in python/version.py'
  exit 1
fi

# Convert version number to java standers
JAVA_VERSION=$REL
if [[ "$REL" == *"post"* ]]; then
  JAVA_VERSION="${REL/post/\.}"
elif  [[ "$REL" == *"b"* ]]; then
  JAVA_VERSION="${REL/b/-beta-}"
else
  JAVA_VERSION=$JAVA_VERSION.RELEASE
fi

cd python
rm -rf dist/
releases=`/usr/local/bin/hub release`
hub_op="create"
for r in $releases
do
    if [ "$r" = "$REL_TAG" ]; then
        hub_op="edit"
        break
    fi
done

./create_sdk_pip_packages.sh sdk
./create_sdk_pip_packages.sh migrationtools
./create_sdk_pypi.sh sdk
./create_sdk_pkgs.sh

mv dist/avisdk-$AVI_VERSION.tar.gz ../avisdk-$AVI_VERSION.tar.gz

if [ -e dist/python-avisdk_0_all.deb ]; then
    mv dist/python-avisdk_0_all.deb ../avisdk-$AVI_VERSION.deb
else
    echo "Avi API SDK Debian package not found. Aborting"
    exit 1
fi

if [ -e dist/avisdk-$AVI_VERSION-1.noarch.rpm ]; then
    mv dist/avisdk-$AVI_VERSION-1.noarch.rpm ../avisdk-$AVI_VERSION.rpm
else
    echo "Avi API SDK RPM package not found. Aborting"
    exit 1
fi

if [ -e dist/avimigrationtools-$AVI_VERSION.tar.gz ]; then
    mv dist/avimigrationtools-$AVI_VERSION.tar.gz ../avimigrationtools-$AVI_VERSION.tar.gz
else
    echo "Avi Migration tools package not found. Aborting"
    exit 1
fi

# Release Avi's Java SDK jar file

if [ -z $AVISDK_PGP_PASSPHRASE ]; then
  echo "Cannot release java SDK AVISDK_PGP_PASSPHRASE is not set"
  exit 1
else
  cd java
  mvn versions:set -DnewVersion=$JAVA_VERSION
  mvn clean deploy -DskipTests -Dgpg.passphrase=$AVISDK_PGP_PASSPHRASE
  cd ..
  cp -java/target/avisdk-$JAVA_VERSION.jar .
  cp -java/target/avisdk-$JAVA_VERSION-javadoc.jar .
  rm -rf java/target/*
fi

rm -rf dist
rm -rf avisdk.egg-info
assets="$assets -a avisdk-$AVI_VERSION.tar.gz#pip-package-avisdk-$AVI_VERSION -a avimigrationtools-$AVI_VERSION.tar.gz#pip-package-avimigrationtools-$AVI_VERSION -a avisdk-$AVI_VERSION.deb#debian-package-avisdk-$AVI_VERSION -a avisdk-$AVI_VERSION.rpm#rpm--package-avisdk-$AVI_VERSION -a avisdk-$JAVA_VERSION.jar -a avisdk-$JAVA_VERSION-javadoc.jar"
cd ../

# avinetworks/avitools release handling
rm -rf avitools
git clone https://github.com/avinetworks/avitools
cd avitools
git remote set-url origin git@github.com:avinetworks/avitools.git
git tag $REL
git push -f origin $REL
cd ..
rm -rf avitools

/usr/local/bin/hub release $hub_op $assets -F ReleaseNote $REL_TAG

rm -rf avisdk-$AVI_VERSION.tar.gz
rm -rf avimigrationtools-$AVI_VERSION.tar.gz
rm -rf avisdk-$AVI_VERSION.deb
rm -rf avisdk-$AVI_VERSION.rpm
rm -rf avisdk-$JAVA_VERSION.jar
rm -rf avisdk-$JAVA_VERSION-javadoc.jar
