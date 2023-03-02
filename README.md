# Task Manager

----
Project Overview
- Backend
    - Spring Boot
    - Spring Data JPA
    - Postgres
- Frontend
    - React(NextJS)


This is a simple CRUD project, that lets the
user create an account, and manage tasks.


TODO:

https://springframework.guru/exception-handling-in-spring-boot-rest-api/ 

error  handling and finish the crud paths

fully utilize docker for dev environment...

DEFAULT uuid_generate_v1()


# To run in production mode, jar, then...

Probably make .sh file that runs this code below...

java -jar final.jar \
--spring.datasource.url=<URL_TO_DB> \
--spring.datasource.username=<user> \
--spring.datasource.password=<password> \
--spring.datasource.driver-class-name=org.postgresql.Driver 

# Other Links

[memory usage reduce](https://stackoverflow.com/questions/44491257/how-to-reduce-spring-boot-memory-usage)