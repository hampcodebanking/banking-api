FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/banking-service-0.0.1.jar
COPY ${JAR_FILE} banking-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "banking-service.jar"]