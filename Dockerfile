# Build WAR using Maven
FROM maven:3.8.6-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Use base Tomcat to deploy WAR
FROM tomcat:9.0-jdk17-temurin
COPY --from=build /app/target/*.war /usr/local/tomcat/webapps/ROOT.war
EXPOSE 8081
