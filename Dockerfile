FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-gitops.jar spring-boot-gitops.jar
ENTRYPOINT ["java","-jar","/spring-boot-gitops.jar"]