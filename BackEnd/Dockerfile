FROM amazoncorretto:11-alpine-jdk  //IMAGEN DONDE PARTIMOS
MAINTAINER yazminvillalba       //DUEÑO
COPY target/YazminVillalba-0.0.1-SNAPSHOT yv-app.jar           //VA A COPIAR EMPAQUETADO A GITHUB
ENTRYPOINT ["java", "-jar", "/yv-app.jar"]         //INSTRUCCION QUE SE VA A EJECUTAR PRIMERO
