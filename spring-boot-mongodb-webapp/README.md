# Spring boot mongodb web app

A Spring boot web project for dealing with mongodb collections 

## Prerequisites

 - Make sure that mongodb is installed and also make sure that whether you started your mongod service

 ```
 > mongod --dbpath="C:/data"
 ```
![alt tag](https://raw.githubusercontent.com/Thirunavukkarasu/spring-development-series/master/spring-boot-mongodb-webapp/screenshots/mongod.png)


## Demo

![alt tag](https://raw.githubusercontent.com/Thirunavukkarasu/spring-development-series/master/spring-boot-mongodb-webapp/screenshots/spring-data-mongo-api.png)


## Navigate by pageNumber
http://localhost:8080/runners?page=0

## Navigate by pageSize
http://localhost:8080/runners?size=6

## Navigate by sorting
http://localhost:8080/runners?sort=runnerId,desc
http://localhost:8080/runners?sort=runnerId,asc

## Rest Controller - Querying the repository 
```
public interface RunnerRepository extends MongoRepository<Runner, String>{
	Page<Runner> findAll(Pageable pageable);
	List<Runner> findAll();	
}
```

## References 
http://docs.spring.io/spring-data/couchbase/docs/current/reference/html/#repositories
https://spring.io/guides/gs/accessing-data-mongodb/
