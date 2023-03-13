#!/bin/bash

# This script is mean to build and redeploy all WARs.

WS=${PWD}

# STOP all docker
docker stop $(docker ps -a -q) &&
# build all
cd jee-web-app &&
mvn clean install -DskipTests=true &&
cd ${WS} &&
cd security/security-ctx &&
mvn clean install -DskipTests=true &&
cd ${WS} &&
cd security/ws-basic &&
mvn clean install -DskipTests=true &&
cd ${WS} &&
# build docker image (this will also copy the WARs)
docker build -t about-jakarta:latest -f docker/Dockerfile . &&
# START all docker
docker compose up --force-recreate
