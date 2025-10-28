# JAX-RS Spring Boot Application

This is a simple RESTful web service built with Spring Boot and JAX-RS (Jersey). It provides basic CRUD operations for a `Compte` (Account) entity.

## Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- JAX-RS (Jersey)
- H2 in-memory database
- Lombok
- Maven

## How to Run

1. Clone the repository.
2. Open a terminal in the project root directory.
3. Run the application using Maven:
   ```bash
   mvn spring-boot:run
   ```
4. The application will be available at `http://localhost:8082`.

## H2 Database Console

You can access the H2 database console to view the data at the following URL:

`http://localhost:8082/h2-console`

Make sure to use the following JDBC URL to connect:
`jdbc:h2:mem:banque`

![H2 Console](Screen/db-H2.png)
![H2 Console Test](Screen/test(db-H2).png)

## REST API Endpoints

The API provides the following endpoints to manage bank accounts:

- **GET /banque/comptes**: Retrieve all accounts.
- **GET /banque/comptes/{id}**: Retrieve a specific account by its ID.
- **POST /banque/comptes**: Create a new account.
- **PUT /banque/comptes/{id}**: Update an existing account.
- **DELETE /banque/comptes/{id}**: Delete an account.

The API supports both JSON and XML formats for requests and responses.

### Postman Tests

Here are some examples of testing the API with SoapUI:

**POST (JSON)**
![POST JSON](Screen/Post%20methode.png)

**POST (XML)**
![POST XML](Screen/Post-methode(xml).png)

**PUT (XML)**
![PUT XML](Screen/Put-methode(xml).png)

**DELETE**
![DELETE](Screen/Delete-methode.png)
