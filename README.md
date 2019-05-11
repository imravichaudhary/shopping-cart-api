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





