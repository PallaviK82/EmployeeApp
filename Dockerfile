FROM openjdk:11
ADD target/EmployeeApp-0.0.1-SNAPSHOT.jar EmployeeApp-0.0.1-SNAPSHOT.jar
EXPOSE 5000
ENTRYPOINT ["java", "-jar", "/EmployeeApp-0.0.1-SNAPSHOT.jar"]