#!/bin/bash
clear

echo "Building Assignment!!"
mvn clean install

echo "Starting Tomcat!!"
mvn tomcat7:run