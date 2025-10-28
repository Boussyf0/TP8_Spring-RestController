# Spring Boot REST API with Spring MVC

This is a simple RESTful web service built with Spring Boot and Spring MVC. It provides basic CRUD operations for a `Compte` (Account) entity.

## Technologies Used

- Java 17
- Spring Boot
- Spring MVC
- Spring Data JPA
- H2 in-memory database
- Swagger (SpringDoc)
- Jackson (for JSON and XML)
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

## Swagger UI API Documentation

Interactive API documentation is available via Swagger UI once the application is running.

`http://localhost:8082/swagger-ui.html`

![Swagger UI](Screen/Swagger.png)

## REST API Endpoints

The API provides the following endpoints to manage bank accounts:

- **GET /banque/comptes**: Retrieve all accounts.
- **GET /banque/comptes/{id}**: Retrieve a specific account by its ID.
- **POST /banque/comptes**: Create a new account.
- **PUT /banque/comptes/{id}**: Update an existing account.
- **DELETE /banque/comptes/{id}**: Delete an account.

The API supports both JSON and XML formats for requests and responses.

### API Testing Examples

Here are some examples of testing the API.

**GET /banque/comptes (JSON)**
![GET All JSON](Screen/Requête%20GET%20pour%20obtenir%20la%20liste%20des%20comptes%20en%20JSON.png)
*Response:*
![JSON Response](Screen/Réponse%20en%20JSON%20pour%20l'endpoint%20:banque:comptes.png)

**GET /banque/comptes (XML)**
![GET All XML](Screen/Requête%20GET%20pour%20obtenir%20la%20liste%20des%20comptes%20en%20XML.png)

**POST /banque/comptes (JSON)**
![POST JSON](Screen/Requête%20POST%20pour%20créer%20un%20nouveau%20compte%20en%20JSON.png)

**POST /banque/comptes (XML)**
![POST XML](Screen/Requête%20POST%20pour%20créer%20un%20nouveau%20compte%20en%20XML.png)

**PUT /banque/comptes/{id} (JSON)**
![PUT JSON](Screen/Requête%20PUT%20pour%20mettre%20à%20jour%20un%20compte%20en%20JSON.png)

**PUT /banque/comptes/{id} (XML)**
![PUT XML](Screen/Requête%20PUT%20pour%20mettre%20à%20jour%20un%20compte%20en%20XML.png)

**DELETE /banque/comptes/{id}**
![DELETE](Screen/Requête%20DELETE%20pour%20supprimer%20un%20compte.png)