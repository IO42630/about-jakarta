#!/bin/bash

docker build -t about-jakarta -f docker/Dockerfile . &&
docker compose up
