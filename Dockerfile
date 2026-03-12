FROM eclipse-temurin:21-jre

WORKDIR /app

COPY fastboot-operator/target/fastboot-operator-*.jar app.jar

ENTRYPOINT ["java","-XX:+UseContainerSupport","-jar","app.jar"]