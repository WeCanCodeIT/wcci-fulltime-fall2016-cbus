#Developing a Spring MVC Application Step-By-Step
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
- [ ] Run ```gradle wrapper``` (the gradle wrapper task) from your local repository folder.
- [ ] Run ```./gradlew eclipse``` (use the gradle wrapper to run the eclipse task) from your local repository folder.
- [ ] Import the generated project into Eclipse.
- [ ] Create source folders named:
    - [ ] src/main/java
    - [ ] src/test/java
    - [ ] src/main/resources

##  Review Application: Display a Single Review
- [ ] Create a ```Review``` class [**Model**] with the following attributes:
    - [ ] id
    - [ ] title
    - [ ] date
    - [ ] author
    - [ ] content
- [ ] Create a ```ReviewController``` class [**Controller**] and ```review-view.html``` template [**View**] that:
    - creates an instance of Review
    - displays the Review instance when the url *http://localhost:8080/review* is accessed    

## Review Application: Retrieve the Review from an Entity Repository
- [ ] Create a ```ReviewRepository``` class with a ```findById(Long id)``` method that returns a ```Review``` instance
- [ ] Modify your ```ReviewController``` to:
    - [ ] accept an *id* request parameter
    - [ ] call the ```findById``` method you created in ```ReviewRepository``` using the id specified in the request
    - [Note: the specific value of the id does not matter yet.]
    
## Review Application: 
    
### References:
- Spring
    - [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content)
    - [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa)
