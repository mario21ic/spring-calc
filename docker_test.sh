#!/bin/bash
# usage: tag_number

CONTAINER_NAME="mycontainer"

docker rm -f $CONTAINER_NAME

docker run --name=$CONTAINER_NAME -d -p 8181:8080 mario21ic/spring-calc:$1

echo "Waiting for port 8181"
while ! netcat -z localhost 8181; do sleep 5; done

sleep 20
curl http://localhost:8181/greeting?name=mario

docker rm -f $CONTAINER_NAME
