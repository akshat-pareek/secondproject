FROM openjdk:8
EXPOSE 8181
ADD build/libs/EmployeeManagementApplication-0.0.1-SNAPSHOT.jar EmployeeManagementApplication-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","/EmployeeManagementApplication-0.0.1-SNAPSHOT.jar" ]