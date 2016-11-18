#Developing a Spring Boot MVC Application with JPA: Step-By-Step
Try completing the following objectives on your own for creating a new Spring MVC Application.

## Project Setup (Iteration 0)
- [ ] Create a git repository for your project.
    - .gitignore: files git should ignore (steal this one: https://raw.githubusercontent.com/btforsythe/review-site-pascal/master/.gitignore) [TODO: create gist]
- [ ] Add a ```build.gradle``` file (steal this one: https://raw.githubusercontent.com/btforsythe/review-site-pascal/di-with-mockito/build.gradle) [TODO: create gist]
    - Spring-specific dependencies within:
        - org.springframework.boot:spring-boot-starter-thymeleaf: Spring Boot + Spring MVC + Thymeleaf
        - org.springframework.boot:spring-boot-devtools: development tools for Spring Boot that allow restarting the application when the application is rebuilt
        - org.springframework.boot:spring-boot-starter-data-jpa: Spring Data + JPA support
        - org.springframework:spring-test: Testing support for Spring
        - org.springframework.boot:spring-boot-starter-test & org.springframework.boot:spring-boot-test: Testing support for Spring Boot
- [ ] Open a Git Bash shell.
- [ ] Create folders named:
    - [ ] src/main/java
    - [ ] src/test/java
    - [ ] src/main/resources
- [ ] Run ```gradle wrapper``` (the gradle wrapper task) from your local repository folder.
- [ ] Run ```./gradlew eclipse``` (use the gradle wrapper to run the eclipse task) from your local repository folder.
- [ ] Import the generated project into Eclipse.

At the end of this step, you should be able to run ReviewApplication, either as a Java Application in Eclipse or via ```./gradlew bootRun```.

## Review Application
In the following steps, place the classes you create in the ```review``` package. The steps do not specifically refer to tests, but create appropriate tests (first!) as you progress. Refer to [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content) for an overview.

Since this will be a Spring boot application:
- [ ] Create an appropriate ```review.ReviewApplication``` class that calls ```SpringApplication.run```.
- [ ] Verify that you can run ReviewApplication, either as a Java Application in Eclipse or via ```./gradlew bootRun```.

###  Display a Single Review
- [ ] Create a ```Review``` class [**Model**] with the following attributes:
    - [ ] id
    - [ ] title
    - [ ] date
    - [ ] author
    - [ ] content
- [ ] Create a ```ReviewController``` class [**Controller**] and a ```review-view.html``` template [**View**] that:
    - creates an instance of Review (use the ```new``` operator)
    - displays the Review instance when the url *http://localhost:8080/review* is accessed    

### Retrieve the Review from an Entity Repository
- [ ] Create a ```ReviewRepository``` class with a ```public Review findOne(Long id)``` method that returns a ```Review``` instance
- [ ] Modify your ```ReviewController``` to:
    - [ ] accept an *id* request parameter
    - [ ] call the ```findOne``` method you created in ```ReviewRepository``` using the id specified in the request
    - [Note: the specific value of the id does not matter yet.]
    
### Display Multiple Reviews
#### Update ```ReviewRepository``` to support multiple reviews
- [ ] Create an instance attribute/field in ```ReviewRepository``` of type ```Map<Long, Review>```
- [ ] Populate this map with three reviews, using each review's id as the key
- [ ] Create a ```public Iterable<Review> findAll()``` method in ```ReviewRepository``` that returns all the reviews from the map.

#### Update Controller and Create View
- [ ] Add a method to ```ReviewController``` and an ```all-reviews-view-.html``` template to display all reviews when the url *http://localhost:8080/allReviews* is accessed 

----------------------
> *content to come*
----------------------

### Read reviews from JPA
Currently we are reading reviews from a map we have hardcoded. We want instead to populate our embedded database with data after our Spring Boot application launches.

We will be using Spring Data's JPA support, which dynamically generates repository implementations, so make the following changes to ```ReviewRepository```:
- [ ] remove its body (method implementations, etc)
- [ ] change it to an interface
- [ ] have it extend ```org.springframework.data.repository.CrudRepository<Repository, Long>``` (```Long``` is the Repository's id type)

We need to populate our embedded database on application startup, so in your ```ReviewApplication``` class:
- [ ] inject a ```ResourceRepository``` instance by using the ```@Resource``` annotation
- [ ] create an inner class that implements ```org.springframework.boot.CommandLineRunner```
    - [ ] implement its ```run(String... args)``` method such that it creates Review instances and calls the repository's ```save``` method to write each of them to the database
- [ ] create a @Bean method in ```ReviewApplication``` that returns an instance of the ```CommandLineRunner``` you created
    
We need to indicate to JPA that reviews are entities, so make the requisite changes to the ```Review``` class. (Refer to [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa) for an example) These involve:
- [ ] annotating the class with @Entity
- [ ] annotating its id attribute with @Id and @GeneratedValue
- [ ] creating a default constructor -- this can (and probably should) be private

At this point, you should be able to run the application and view a listing of reviews in your browser.

### References
- Spring MVC Tutorial: [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content)
- Spring JPA Tutorial: [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa)
