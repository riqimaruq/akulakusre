FROM openjdk:17-jdk-alpine
ARG JAR_FILE=/var/lib/jenkins/workspace/maven-job/target/*.jar
COPY /var/lib/jenkins/workspace/maven-job/target/akulaku-0.0.1-SNAPSHOT.jar /app/akulaku.jar
ENTRYPOINT ["java","-jar","/app.jar"]
