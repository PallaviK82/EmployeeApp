FROM openjdk:11
ADD target/EmployeeApp.jar EmployeeApp.jar
EXPOSE 5000
ENTRYPOINT ["java", "-jar", "EmployeeApp.jar"]