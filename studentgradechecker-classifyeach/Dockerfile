# syntax=docker/dockerfile:1

FROM maven:3.8.3-jdk-11 AS build
WORKDIR /app
COPY src /app
COPY pom.xml /app
RUN mvn clean package
FROM openjdk:18-ea-11-jdk-alpine3.14
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 80
ENTRYPOINT ["java","-jar","/app.jar"]