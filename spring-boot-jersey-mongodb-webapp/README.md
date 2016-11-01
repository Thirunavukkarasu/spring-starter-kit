# spring-boot-jersey-mongodb-webapp

A spring boot webapp built on top Jersey REST instead of MVC rest

## Prerequisites

 - Make sure that mongodb is installed and also make sure that whether you started your mongod service

 ```
 > mongod --dbpath="C:/data"
 ```
![alt tag](https://raw.githubusercontent.com/Thirunavukkarasu/spring-development-series/master/spring-boot-mongodb-webapp/screenshots/mongod.png)


## Demo

### GET request
![alt tag](https://raw.githubusercontent.com/Thirunavukkarasu/spring-development-series/master/spring-boot-jersey-mongodb-webapp/screenshots/Get.png)

### POST request
![alt tag](https://raw.githubusercontent.com/Thirunavukkarasu/spring-development-series/master/spring-boot-jersey-mongodb-webapp/screenshots/Post.png)

### PUT request
![alt tag](https://raw.githubusercontent.com/Thirunavukkarasu/spring-development-series/master/spring-boot-jersey-mongodb-webapp/screenshots/Put.png)

### DELETE request
![alt tag](https://raw.githubusercontent.com/Thirunavukkarasu/spring-development-series/master/spring-boot-jersey-mongodb-webapp/screenshots/Delete.png)

## MongoDB Commands

```
> show collections
```

```
> db.runner.find().pretty()
```

![alt tag](https://raw.githubusercontent.com/Thirunavukkarasu/spring-development-series/master/spring-boot-jersey-mongodb-webapp/screenshots/MongoDB-commands.png)
