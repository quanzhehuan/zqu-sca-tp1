FROM openjdk:11
ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS \
JAVA_OPTS=""
WORKDIR /app
ADD target/*.jar front-0.0.1-SNAPSHOT.jar
#EXPOSE 8081
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/front-0.0.1-SNAPSHOT.jar"]
