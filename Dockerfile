FROM openjdk:17
WORKDIR /app
COPY target/reee-0.0.1-SNAPSHOT.jar   /app/docker.jar
ENTRYPOINT ["java","-jar","/app/docker.jar"]
EXPOSE 8080