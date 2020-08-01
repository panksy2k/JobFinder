Services that could be used for managing the jobs inside the application

How to run the application
==========================

Build - create docker image (and tag it) from the artifact created at the same time
mvn clean package docker:build

Run the container
    <h5>in background</h5>
    <h6>mvn clean package docker:start</h6>
    
    in foreground
    mvn clean package docker:run


Run - Spin up the docker image created earlier and instantiate the application / container
mvn docker:run

Maven Plugins used for Docker 
docker-maven-plugin in io.fabric8 - http://dmp.fabric8.io/#start-logging

Run a sample request using http client
$ http POST http://localhost:8080/register < src/main/resources/static/registration.json

Push the created docker image to repository
docker image push panksy2k/jobfinder:latest


