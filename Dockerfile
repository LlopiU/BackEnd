FROM amazoncorretto:11-alpine-jdk //imagen inicial
MAINTAINER LlopiU //Dueño
COPY target/ull-0.0.1-SNAPSHOT.jar ull-app.jar//copiar a github 
ENTRYPOINT ["java","-jar","/ull-app.jar"]//inst a ejecutar
