FROM amazoncorretto:11-alpine-jdk // Imagen de base de Java
MAINTAINER ULL // Dueño
COPY target/ull-0.0.1-SNAPSHOT.jar ull-app.jar // copia empaquetado a GitHub
ENTRYPOINT ["java","-jar","ull-app.jar"]// Inst de ejecucion 
