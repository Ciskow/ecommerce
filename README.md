# e-commerce - Apache Kafka and Spring Boot

How to develop a e-commerce using microsservices architecture

## Objectives
Develop a e-commerce solution with microsservices architecture and apply integration event oriented between them with Apache Kafka
## Technologies used
+ Java 16
+ Spring Boot 2.5.5
+ Kafka
+ Avro
+ PostgreSQL
+ Github
## How to test
To test the API you need to execute `docker/docker-compose-sample.yml`

With the services running, execute the API inside a IDE and make the requests with Postman or similar.
## Endpoints & Payloads
### Endpoints
#### Register checkout
**Action** | **Endpoint** | **Method**
---------- | ------------ | ----------
Register checkout | _api/v1/checkout_ | POST
