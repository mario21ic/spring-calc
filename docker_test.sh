#!/bin/bash
# usage: tag_number

docker rm -f mycontainer

docker run --name=mycontainer -d -p 8181:8080 mario21ic/spring-calc:$1

echo "Waiting for port 8181"
while ! netcat -z localhost 8181; do sleep 5; done

sleep 20
curl http://localhost:8181/greeting?name=mario
