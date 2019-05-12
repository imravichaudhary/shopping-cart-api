# Sample Shopping Cart API application using Spring Boot and MongoDB

### Run the MongoDB using Docker Container

```
docker run -d -p 27017-27019:27017-27019 --name mongodb \
    -e MONGO_INITDB_ROOT_USERNAME=mongoadmin \
    -e MONGO_INITDB_ROOT_PASSWORD=secret \
    -e MONGO_INITDB_DATABASE=shoppingcart \
    mongo

// Connect to it using Interactive terminal
docker exec -it mongodb bash
mongo -u mongoadmin -p secret --authenticationDatabase admin shoppingcart
```

### Swagger API Documentation
- Run the application
- Visit http://localhost:8080/swagger-ui.html

### API Testing using Postman
- Run the application
- Find the test collection in [Postman](./Postman/) directory
- Import the json file in Postman
- Execute the Collection Runner

### Requirement

Develop an online shopping cart application for a company which sells products (feel free to sell
any product of your choice eg. Electronics, Clothing, etc) with the following capabilities.
Note
● You do not need to implement authentication / user management, it is not required.
● If you think that implementing the challenge will take you substantial amount of time, you
can implement some of the requirements below. For example, you can choose to
implement the front-end with a mocked data OR build the REST API with mocked
backend.
Use Cases
1. As a user, I should be able to view the list of products with the product information.
2. The user should be able to specify the quantity for each product they wish to put into the
shopping cart.
3. The user should be able to review their shopping cart to update the quantity or remove
the product from the cart.
4. The user should be able to go back to view the list of products and add more to their
shopping cart.
5. The user should be able to submit the order after which an order confirmation page
should be displayed.
6. (Optional) The user should be able to close their tab or browser and return to the
application with the last state of their shopping cart