
FROM eclipse-temurin:21-jre

WORKDIR /app

COPY target/java-automation-cicd-1.0-SNAPSHOT.jar app.jar

CMD ["java", "-cp", "app.jar", "App"]
