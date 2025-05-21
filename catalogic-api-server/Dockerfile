# Use EFlipse Temurin 21 JDK as the base image
FROM eclipse-temurin:24 AS builder
ENV LANGUAGE='en_US:en'
# Set the working directory inside the container
WORKDIR /catalogic-api-server
# Copy the application JAR file into the container
COPY ./build/libs/catalogic-api-server.jar ./server.jar
# Expose the port the application will run on
EXPOSE 8080
# Define the command to run the application
CMD ["java", "-jar", "server.jar"]