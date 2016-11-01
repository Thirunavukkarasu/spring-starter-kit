
A spring boot webapp built on top Jersey REST instead of MVC rest

## Prerequisites

 - Make sure that mongodb is installed and also make sure that whether you started your mongod service

 ```
 > mongod --dbpath="C:/data"
 ```
![alt tag](https://raw.githubusercontent.com/Thirunavukkarasu/spring-development-series/master/spring-boot-mongodb-webapp/screenshots/mongod.png)


## Demo

![alt tag](https://raw.githubusercontent.com/Thirunavukkarasu/spring-development-series/master/spring-boot-jersey-mongodb-webapp/screenshots/Get.png)

![alt tag](https://raw.githubusercontent.com/Thirunavukkarasu/spring-development-series/master/spring-boot-jersey-mongodb-webapp/screenshots/Post.png)

![alt tag](https://raw.githubusercontent.com/Thirunavukkarasu/spring-development-series/master/spring-boot-jersey-mongodb-webapp/screenshots/Put.png)

![alt tag](https://raw.githubusercontent.com/Thirunavukkarasu/spring-development-series/master/spring-boot-jersey-mongodb-webapp/screenshots/Delete.png)

## MongoDB Commands

```
> show collections
```

```
> db.runner.find().pretty()
```

![alt tag](https://raw.githubusercontent.com/Thirunavukkarasu/spring-development-series/master/spring-boot-jersey-mongodb-webapp/screenshots/MongoDB-commands.png)
