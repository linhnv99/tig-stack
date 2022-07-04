FROM openjdk:8

COPY build/libs/tig-stack-0.0.1-SNAPSHOT.jar tig-stack.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "tig-stack.jar"]