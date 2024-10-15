# Use the downloaded OpenJDK image as a parent
FROM openjdk:21-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the local jar file to the container
COPY target/fibonacci-project-1.0-SNAPSHOT.jar app.jar

# Command to run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]