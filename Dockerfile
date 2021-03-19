FROM openjdk:8
ADD target/springdockerdemo-0.0.1-SNAPSHOT.jar springdockerdemo.jar
EXPOSE 8080
CMD ["java", "-jar", "springdockerdemo.jar"]