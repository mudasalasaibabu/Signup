# ✅ Use a valid Maven base image with OpenJDK 17
FROM maven:3.8.6-eclipse-temurin-17 AS build

WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# ✅ Use a Tomcat base image to run the WAR file
FROM tomcat:9.0-jdk17-temurin

# Remove default ROOT app
RUN rm -rf /usr/local/tomcat/webapps/ROOT

# Copy your WAR file as ROOT.war
COPY --from=build /app/target/UserRegistration.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080
