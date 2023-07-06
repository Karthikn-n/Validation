FROM alpine:3.17.0
RUN apk update && apk add openjdk17-jre
ENV PATH="/usr/lib/jvm/java-17-openjdk-amd64/bin:${PATH}"
COPY target/demo1-0.0.1-SNAPSHOT.jar validate.jar
# ENV PATH="/usr/bin/java:${PATH}"
EXPOSE 8080
CMD ["java", "-jar", "validate.jar"]