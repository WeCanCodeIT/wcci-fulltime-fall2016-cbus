#Developing a Spring MVC Application Step-By-Step
Try completing the following objectives on your own for creating a new Spring MVC Application.

- [ ] Create a git repository for your project.
    - .gitignore: files git should ignore (steal this one: https://raw.githubusercontent.com/btforsythe/review-site-pascal/master/.gitignore) [TODO: create gist]
- [ ] Add a build..gradle file (steal this one: https://raw.githubusercontent.com/btforsythe/review-site-pascal/di-with-mockito/build.gradle) [TODO: create gist]
    - Spring-specific dependencies within:
        - org.springframework.boot:spring-boot-starter-thymeleaf: Spring Boot + Spring MVC + Thymeleaf
        - org.springframework.boot:spring-boot-devtools: development tools for Spring Boot that allow restarting the application when the application is rebuilt
        - org.springframework.boot:spring-boot-starter-data-jpa: Spring Data + JPA support
        - org.springframework:spring-test: Testing support for Spring
        - org.springframework.boot:spring-boot-starter-test & org.springframework.boot:spring-boot-test: Testing support for Spring Boot
- [ ] Open a Git Bash shell.
- [ ] Run the gradle wrapper task from your local repository folder.
- [ ] Run ```./gradlew eclipse``` from your local repository folder.

References:
- Spring
    - [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa)
    - []
