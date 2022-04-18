#stage1
FROM maven:3.6.3-adoptopenjdk-11 as stage1
RUN addgroup --system --gid 1001 gf && adduser --system --home /home/front --uid 1001 --gid 1001 front
RUN mkdir /app && chown -R front:gf /app
USER front
WORKDIR /app
RUN mvn clean package

#stage2
FROM openjdk:11 as stage2
ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS \
JAVA_OPTS=""
WORKDIR /app
ADD target/*.jar front-0.0.1-SNAPSHOT.jar
#EXPOSE 8081
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/front-0.0.1-SNAPSHOT.jar"]