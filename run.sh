#!/bin/bash

set -o xtrace

mvn compile

mvn clean package

set +o xtrace

printf "\n-- Program Output --\n\n"

java -cp target/tdd-1.0-SNAPSHOT.jar \
com.tecprog.App
