FROM eclipse-temurin:17
COPY target/car.jar car.jar
CMD [ "java","-jar","car.jar" ]
