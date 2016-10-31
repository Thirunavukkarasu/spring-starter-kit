# Spring boot couchbase web app

A Spring boot web project for dealing with couchbase repositories 

## Demo

![alt tag](https://raw.githubusercontent.com/Thirunavukkarasu/spring-development-series/master/spring-boot-couchbase-webapp/demo/pagniation-and-size.png)

![alt tag](https://github.com/Thirunavukkarasu/spring-development-series/blob/master/spring-boot-couchbase-webapp/demo/couchbase-view.png)

![alt tag](https://github.com/Thirunavukkarasu/spring-development-series/blob/master/spring-boot-couchbase-webapp/demo/view-code.png)




## Navigate by pageNumber
http://localhost:8080/runners?page=0

## Navigate by pageSize
http://localhost:8080/runners?size=6

## Navigate by sorting
http://localhost:8080/runners?sort=runnerId,desc
http://localhost:8080/runners?sort=runnerId,asc

## Rest Controller - Querying the repository 
```
    @RequestMapping(value = "/runners", method = RequestMethod.GET)
    public Page<Runner>  runners(Pageable pageable) {
        
        Page<Runner> page = runnerRepository.findAll(pageable);
        
        return page;
    }
```
## Repository - PagingAndSortingRepository

```
public interface RunnerRepository extends PagingAndSortingRepository<Runner, String>{
	@View(designDocument = "runner", viewName = "all")
	Page<Runner> findAll(Pageable pageable);
	Page<Runner> findAll();	
}

```

## References 

http://docs.spring.io/spring-data/couchbase/docs/current/reference/html/#repositories
https://github.com/eugenp/tutorials/blob/master/spring-data-couchbase-2/
http://www.baeldung.com/spring-data-couchbase
