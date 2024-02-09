# Dockerfile

# Use AdoptOpenJDK 11 base image
FROM adoptopenjdk/openjdk11:alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged JAR file into the container
COPY target/SamuraiTrain-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that the Spring Boot application will run on
EXPOSE 8000

# Specify the command to run the Spring Boot application
CMD ["java", "-jar", "app.jar"]
