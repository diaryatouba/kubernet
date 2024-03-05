FROM openjdk:17
EXPOSE 8080
ADD target/kubernet.jar kubernet.jar
ENTRYPOINT ["java", "-jar", "/kubernet.jar"]
