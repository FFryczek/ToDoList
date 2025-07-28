# ToDoList

Spring Boot Todo REST API
=========================
Simple REST API for managing tasks, built with Spring Boot and MySQL.

Status: Learning project / in development

Features (CRUD):
- Add task (POST /api/tasks)
- Get all tasks (GET /api/tasks)
- Get task by ID (GET /api/tasks/{id})
- Update task (PUT /api/tasks/{id})
- Delete task (DELETE /api/tasks/{id})

Tech:
- Java 17+, Spring Boot, Spring Data JPA, MySQL, Maven
- UUID used as primary keys

Setup:
1. Create a database named todoDB in MySQL.
2. Configure application.properties:
   spring.datasource.url=jdbc:mysql://localhost:3306/todoDB
   spring.datasource.username=your_user
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
3. Run the project.

Author: Filip Fryczek (github.com/FFryczek)
