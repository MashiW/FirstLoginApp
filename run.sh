#!/bin/bash

mvn clean install;
cp /home/hsenid/Projects/LogAppNew/target/LogAppNew.war /usr/local/tomcat-8.0.32/webapps;
