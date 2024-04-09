FROM eclipse-temurin:17
COPY target/checker.jar checker.jar
CMD [ "java","-jar","checker.jar" ]