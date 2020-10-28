FROM maven:3.6.3-jdk-11

WORKDIR /usr/src/app

COPY . /usr/src/app
RUN mvn package

ENV PORT 8003
EXPOSE $PORT
CMD [ "sh", "-c", "mvn -Dserver.port=${PORT} spring-boot:run" ]
