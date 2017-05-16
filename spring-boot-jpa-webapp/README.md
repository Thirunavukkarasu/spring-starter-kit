
# spring-boot-jpa-webapp

This application is built using Spring Boot, Spring Data JPA, Spring MVC REST and Hibernate ORM  framework we use for communicating to Microsoft SQL Server.

# Creating Table

# Selecting Records

# Showing Records through API with pagination  

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