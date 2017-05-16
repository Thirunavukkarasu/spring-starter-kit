
# spring-boot-jpa-webapp

This application is built using Spring Boot, Spring Data JPA, Spring MVC REST and finally we use Hibernate ORM  framework for communicating to Microsoft SQL Server 2008/2012/2014.

# Creating Table
![Creating table](https://raw.githubusercontent.com/Thirunavukkarasu/spring-development-series/master/spring-boot-jpa-webapp/screenshots/1_Create_Table.PNG)
# Selecting Records
![Selecting records](https://raw.githubusercontent.com/Thirunavukkarasu/spring-development-series/master/spring-boot-jpa-webapp/screenshots/2_Select_Records.PNG)
# Showing Records through API with paginations  
![Showing records thro api](https://raw.githubusercontent.com/Thirunavukkarasu/spring-development-series/master/spring-boot-jpa-webapp/screenshots/3_Records_Through_Api.PNG)
# application.properties
```
spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=default
spring.datasource.username=sa
spring.datasource.password=admin@1234
spring.datasource.driverClassName=com.microsoft.sqlserver.jdbc.SQLServerDriver
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.SQLServer2012Dialect
spring.jpa.hibernate.ddl-auto = validate
```
