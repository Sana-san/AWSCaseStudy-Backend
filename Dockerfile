FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-ecommerce.jar spring-boot-ecommerce.jar
ENTRYPOINT ["java","-jar", "/spring-boot-ecommerce.jar"]