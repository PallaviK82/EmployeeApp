FROM openjdk:11
ADD target/EmployeeApp-0.0.1-SNAPSHOT.jar EmployeeApp.jar
EXPOSE 5000
ENTRYPOINT ["java", "-jar", "/EmployeeApp.jar"]