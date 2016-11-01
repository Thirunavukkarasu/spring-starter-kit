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

```
	/***
	 * Get all the MongoDB runner collection documents
	 * @param runner
	 * @return Page<Runner>
	 */	
	@GET
	public Page<Runner> getRunners(Pageable pageable){
		return runnerRepository.findAll(pageable);
	}
```
![alt tag](https://raw.githubusercontent.com/Thirunavukkarasu/spring-development-series/master/spring-boot-jersey-mongodb-webapp/screenshots/Get.png)

### POST request

```
	/***
	 * Insert the MongoDB runner collection with the given runner details
	 * @param runner
	 * @return List<Runner>
	 */	
	@POST
	public List<Runner> saveRunner(Runner runner){
		runnerRepository.save(runner);
		return runnerRepository.findAll();
	}
```
![alt tag](https://raw.githubusercontent.com/Thirunavukkarasu/spring-development-series/master/spring-boot-jersey-mongodb-webapp/screenshots/Post.png)

### PUT request

```
	/***
	 * Update the MongoDB runner collection for the given runnerId
	 * @param runner
	 * @return List<Runner>
	 */
	@PUT
	public List<Runner> updateRunner(Runner runner){
		Runner existingRunner = runnerRepository.findByRunnerId(runner.getRunnerId());
		existingRunner.setRunnerName(runner.getRunnerName());
		runnerRepository.save(existingRunner);
		return runnerRepository.findAll();
	}
```
![alt tag](https://raw.githubusercontent.com/Thirunavukkarasu/spring-development-series/master/spring-boot-jersey-mongodb-webapp/screenshots/Put.png)

### DELETE request

```
	/***
	 * Delete the MongoDB runner collection for the given runnerId
	 * @param runner
	 * @return List<Runner>
	 */
	@DELETE
	public List<Runner> deleteRunner(Runner runner){
		runnerRepository.deleteByRunnerId(runner.getRunnerId());
		return runnerRepository.findAll();
	}
```
![alt tag](https://raw.githubusercontent.com/Thirunavukkarasu/spring-development-series/master/spring-boot-jersey-mongodb-webapp/screenshots/Delete.png)

## MongoDB Commands

```
> show collections
```

```
> db.runner.find().pretty()
```

![alt tag](https://raw.githubusercontent.com/Thirunavukkarasu/spring-development-series/master/spring-boot-jersey-mongodb-webapp/screenshots/MongoDB-commands.png)
