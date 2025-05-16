# microservice-tutorials
# Microservices Tutorials - Spring Boot Based System

A complete microservices-based system demonstrating core concepts including:
- Eureka Service Discovery
- API Gateway (Spring Cloud Gateway)
- Configuration Server
- Inter-Service Communication (RestTemplate / FeignClient)
- Resilience4J for Fault Tolerance
- MySQL integration
---

## 🧩 Technologies Used

- Java 21
- Spring Boot 3.x
- Spring Cloud (Eureka, Config, Gateway)
- Spring Web, Spring Data JPA
- MySQL
- Lombok
- Resilience4J
- Maven

---

## 🏗️ Microservices Architecture
                      +------------------+
                      |  Config Server   |
                      +--------+---------+
                               |
                    +----------v----------+
                    |    Eureka Server    |
                    +----------+----------+
                               |
         +---------------------+---------------------+
         |                     |                     |
+--------v--------+   +--------v--------+   +--------v--------+
|  User Service   |   | Hotel Service   |   | Rating Service  |
+-----------------+   +-----------------+   +-----------------+

         +-----------------------------------------------+
         |               API Gateway                     |
         +-----------------------------------------------+

---

## 🧪 Modules

| Service Name       | Description                          | Port  |
|--------------------|--------------------------------------|--------|
| Eureka Server      | Service registry                     | 8761   |
| Config Server      | Centralized config management        | 8888   |
| API Gateway        | Routing entry point                  | 8080   |
| User Service       | Manages user data                    | 8081   |
| Hotel Service      | Manages hotel data                   | 8082   |
| Rating Service     | Handles hotel/user ratings           | 8083   |

---

## ⚙️ Setup Instructions

### 1. Clone the repository
```bash
git clone https://github.com/shreyamahalle/microservices-tutorials.git
cd microservices-tutorials

## Service Registry (Eureka Server)
```
```
- Port: `8761`
- URL: [http://localhost:8761](http://localhost:8761)
```
