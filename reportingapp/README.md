# Spring + MVC + MyBatis

### Introduction
This sample project sets a basic framework for a Spring MVC application with MyBatis used for persistence. Mybatis is using Oracle database.

### Frameworks
The following frameworks are used:

* Spring Boot
* Spring MVC
* MyBatis
* Thymeleaf

### Code Structure
Source code reside inside src/main/java folder.There are folders for specific purposes:
* controller - All endpoints will go into this folder
* orm - ORM mapping classes go here. The queries are annotated on methods.
* domain - The POJOs that represent models go here

Views are inside src/main/resources folder. There are folders for specific view types:
* static - All static pages go here
* templates - All dynamic pages ho here

Unit Tests are in src/test/java folder. 

### Configuration
Currently application only needs database configuration. The database configuration is in src/main/resources/application.properties file. Add your database details for application to work.

### To Run the Application
* From IDE, run as Spring boot application
* From command line

	$ cd reporting-app
	$ mvnw spring-boot:run 
	
* Build an executable JAR
	$ cd reporting-app
	$ mvnw clean package
	$ java -jar target/reporting-app-0.0.1-SNAPSHOT.jar.jar 

### Test the Application
Once the application is running, visit http://localhost:8080/Employee, where you should see the home page (index.html)


### Packaging to WAR
If you want to package the application as a war file instead of executable jar file, change the attribute value for packaging from jar to war in pom.xml.

	<packaging>war</packaging>
	
Next, build project using:

	mvn package
	
