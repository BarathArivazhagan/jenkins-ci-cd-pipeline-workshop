FROM openjdk:8-jdk-alpine as final
ADD target/spring-boot-demo-*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]

