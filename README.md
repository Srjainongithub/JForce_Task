# Customer Feedback System

A Full-Stack Web Application built using Java, Spring Boot, Thymeleaf, and MySQL. This project allows users to register, log in, and manage their feedback (Add/Edit) through an interactive web UI. It also includes an Admin Dashboard with full CRUD capabilities and automated tracking of submission dates.

---

## Features

- **User Authentication:** Secure Sign-Up (Username, Email, Password, Confirm Password validation) and Log In functionality.
- **Dynamic Feedback Forms:** Users can easily submit feedback. The form dynamically shifts between "Add Feedback" and "Edit Feedback" modes when updating an entry.
- **Admin Dashboard:** A structured table view showcasing all submitted feedbacks along with unique IDs and auto-generated submission dates.
- **Full CRUD Operations:** Capability to View, Edit, and Delete feedback records instantly.
- **Session Management:** Easy navigation with a functional Log Out link.

---

## Tech Stack

- **Backend Framework:** Spring Boot (Java)
- **Frontend / Template Engine:** Thymeleaf, HTML5, CSS3
- **Database:** MySQL
- **Data Access / ORM:** Spring Data JPA / Hibernate
- **Build Tool:** Maven

---

## Project Structure

```text
src/
├── main/
│   ├── java/com/example/demo/
│   │   ├── controller/      # Handles Routing (UserController, FeedbackController)
│   │   ├── model/           # Database Entities (User, Feedback)
│   │   └── repository/      # JPA Data Repositories (UserRepository, FeedbackRepository)
│   └── resources/
│       ├── templates/       # HTML Frontend Views (login, register, feedback)
│       └── application.properties  # Database configuration parameters


Prerequisites & Configuration
1. Database Setup
Create a schema named feedback_db in your local MySQL instance.

2. Application Configuration
Update your src/main/resources/application.properties file with your MySQL credentials:

Properties
server.port=8081

spring.datasource.url=jdbc:mysql://localhost:3306/feedback_db
spring.datasource.username=root
spring.datasource.password=YOUR_MYSQL_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true



Run the Spring Boot application using Maven:

Terminal:
./mvnw spring-boot:run
Access the application in your browser at:

Registration: http://localhost:8081/register

Login: http://localhost:8081/login
