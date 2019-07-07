FROM openjdk:8-jdk as compiler

RUN mkdir /app/
WORKDIR /app

# Copiar todo el code
COPY ./ /app/

# Descargar gradle
RUN /app/gradlew

# Run Tests
#RUN /app/gradlew test

# Generar jar
RUN /app/gradlew bootJar


FROM openjdk:8-jre

COPY --from=compiler /app/build/libs/gs-rest-service-0.1.0.jar /usr/bin/

EXPOSE 8080
CMD ["java", "-jar", "/usr/bin/gs-rest-service-0.1.0.jar"]
