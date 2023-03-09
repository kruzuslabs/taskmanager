# Task Manager
Task Manager is a web application for managing tasks, built using Spring Boot and React. It allows users to create, update, and delete tasks, and provides a user-friendly interface for managing their tasks.

# Features
Create tasks with a title, description, and due date
Update tasks with new information
Delete tasks that are no longer needed
View all tasks in a list format
Filter tasks by due date
# Technologies
Task Manager is built using the following technologies:

Spring Boot - Backend framework for building RESTful APIs with Java
React - Frontend library for building user interfaces
Axios - Promise-based HTTP client for making API requests
PostgreSQL - Open source relational database
Getting Started
To get started with Task Manager, follow these steps:

Build the Spring Boot application by running mvn clean package in the backend folder. This will generate a JAR file in the target folder.
Copy the JAR file to your production server.
Run the application using the following command:

```shell
java -jar final.jar \
--spring.datasource.url=<URL_TO_DB> \
--spring.datasource.username=<DATABASE_USERNAME> \
--spring.datasource.password=<DATABASE_PASSWORD> \
--spring.datasource.driver-class-name=org.postgresql.Driver
```
Replace <URL_TO_DB>, <DATABASE_USERNAME>, and <DATABASE_PASSWORD> with the appropriate values for your database.

RESTful CRUD Endpoints
Task Manager provides the following RESTful CRUD endpoints for managing tasks:

```
GET /api/tasks - Get a list of all tasks
POST /api/create/task - Create a new task
PUT /api/task/{id} - Update an existing task
DELETE /api/task/{id} - Delete an existing task
```

To create a new task, send a POST request to /api/tasks with a JSON payload containing the title, description, and due date of the task. The server will respond with a JSON object representing the newly created task.

To update an existing task, send a PUT request to /api/tasks/{id} with a JSON payload containing the updated information for the task. The server will respond with a JSON object representing the updated task.

To delete an existing task, send a DELETE request to /api/tasks/{id}. The server will respond with a success message if the task was deleted successfully.
