FROM openjdk:8-jre

COPY build/libs/gs-rest-service-0.1.0.jar /usr/bin/

EXPOSE 8080
CMD ["java", "-jar", "/usr/bin/gs-rest-service-0.1.0.jar"]
