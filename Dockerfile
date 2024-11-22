FROM eclipse-temurin:17
COPY target/technologies.jar technologies.jar
CMD [ "java", "-jar", "technologies.jar" ] 