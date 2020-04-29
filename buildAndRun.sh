#!/bin/sh
mvn clean package && docker build -t com.mycompany/pw-Dortu .
docker rm -f pw-Dortu || true && docker run -d -p 8080:8080 -p 4848:4848 --name pw-Dortu com.mycompany/pw-Dortu 
