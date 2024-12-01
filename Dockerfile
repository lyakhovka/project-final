
FROM openjdk:17-jdk-slim


WORKDIR /app


COPY target/jira_rush.jar /app/app.jar


COPY resources /app/resources


EXPOSE 8080


ENTRYPOINT ["java", "-jar", "/app/app.jar"]
