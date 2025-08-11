# tour-api
tour-api This is a RESTful API for managing tour packages, built with Spring Boot and PostgreSQL. The API allows you to create and retrieve tour package information from a database.
# tour-api

This is a RESTful API for managing tour packages, built with Spring Boot, JPA, and PostgreSQL.

## Technologies Used

* **Java 21**: Programming language
* **Spring Boot**: Framework for building the application
* **Maven**: Dependency management
* **PostgreSQL**: Database for storing tour package information
* **JPA (Hibernate)**: For object-relational mapping
* **Lombok**: To reduce boilerplate code (Getters, Setters, etc.)

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

You need to have the following installed on your machine:
* Java 21 or later
* Apache Maven
* PostgreSQL database server

### Database Setup

1.  Start your PostgreSQL server.
2.  Connect to your PostgreSQL instance and create a new database named `tourdb`.
    ```sql
    CREATE DATABASE tourdb;
    ```
3.  Create a new user with a password.
    ```sql
    CREATE USER touruser WITH PASSWORD 'admin';
    ```
4.  Grant all privileges on the `tourdb` database to the new user.
    ```sql
    GRANT ALL PRIVILEGES ON DATABASE tourdb TO touruser;
    ```

### Configuration

The database connection details are configured in `src/main/resources/application.properties`. Ensure these match your PostgreSQL setup.

```properties
spring.application.name=tour-api
spring.datasource.url=jdbc:postgresql://localhost:5432/tourdb
spring.datasource.username=touruser
spring.datasource.password=admin
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
server.port=8080
```


https://github.com/user-attachments/assets/12dc66c0-d5a3-47ae-a89d-3f5565b0915c


<img width="1440" height="900" alt="Screenshot 2025-08-11 at 1 39 20 PM" src="https://github.com/user-attachments/assets/74e42e73-eab0-44a3-a7e4-4b5a0f9c4a2a" />




