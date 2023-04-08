# Microservices with Spring Boot and Spring Cloud
This project is an example of a microservices architecture built with Spring Boot and Spring Cloud. The project includes several microservices, including a Product Service that offers a REST API, a Config Service to manage configuration files, a Proxy Service for routing requests and load balancing, and a Discovery Service for registering and discovering instances of other services.

# Microservices
The project contains the following microservices:

## Product Service
The Product Service is the main service that provides a REST API to list a set of products. If you navigate to http://localhost:8080/products, you will see the list of products.

## Config Service
The Config Service is responsible for centralizing the configuration files of the different microservices in a single location. Spring Cloud Config provides server-side and client-side support for externalizing configurations in a distributed system. The configuration directory should be a git repository.

To set up the Config Service, follow these steps:

- Open the terminal with IntelliJ and navigate to the Config Service directory: 
```shell
../configService/src/main/resources/myConfig
```
- Initialize your repository: **git init**
- Add the root entry to the repository: **git add .**
- Commit the changes: **git commit -m "add ."**

## Proxy Service
The Proxy Service is responsible for routing a request to one of the instances of a service, in order to automatically manage the distribution of load. With **Spring Cloud API Gateway**, it provides a unified interface for consumers, hiding the low-level details of the microservices architecture.

## Discovery Service
The Discovery Service is responsible for registering the instances of services to be discovered by other services. To avoid strong coupling between microservices, it is strongly recommended to use a discovery service, which allows registering the properties of different services and avoiding the need to call a service directly.

To view the **Eureka Service**, go to http://localhost:8761. The following interface is displayed:
[![Eureka](https://i.ibb.co/h1Fy5CL/1.png "Eureka")](https://i.ibb.co/h1Fy5CL/1.png "Eureka")

# Running the Microservices
- To run the microservices, you can use the following steps:

- Clone the repository to your local machine.

- Open the project in your IDE.

- Build the project using Maven: **mvn clean install**.

Start the services in the following order:

1. Config Service
2. Discovery Service
3. **Restart** Config Service
4. **Restart** Discovery Service
5. Proxy Service
6. Product Service
