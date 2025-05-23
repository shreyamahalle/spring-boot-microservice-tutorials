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
```
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
```
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
# Start Eureka Server
```
- Port: `8761`
- URL: [http://localhost:8761](http://localhost:8761)
```
## 📚 References

- [Spring Cloud](https://spring.io/projects/spring-cloud)  
- [Resilience4J](https://resilience4j.readme.io/)  
- [Eureka Service Discovery](https://cloud.spring.io/spring-cloud-netflix/multi/multi__service_discovery_eureka_clients.html)  
- [Spring Cloud Gateway](https://spring.io/projects/spring-cloud-gateway)  



## 🌐 Connect With Me

<div align="center" style="margin: 20px 0;">
  <!-- GitHub -->
  <a href="https://github.com/shreyamahalle" style="margin: 0 10px;">
    <img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white" alt="GitHub" height="28"/>
  </a>
  
  <!-- LinkedIn (with your corrected link) -->
  <a href="https://www.linkedin.com/in/shreya-mahalle-254657176/?originalSubdomain=in" style="margin: 0 10px;">
    <img src="https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white" alt="LinkedIn" height="28"/>
  </a>
  
  <!-- Twitter -->
  <a href="https://twitter.com/shreyamahalle" style="margin: 0 10px;">
    <img src="https://img.shields.io/badge/Twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white" alt="Twitter" height="28"/>
  </a>
  
  <!-- Email -->
  <a href="mailto:shreyamahalle8@example.com" style="margin: 0 10px;">
    <img src="https://img.shields.io/badge/Email-D14836?style=for-the-badge&logo=gmail&logoColor=white" alt="Email" height="28"/>
  </a>
</div>

<div align="center" style="margin-top: 15px;">
  <a href="https://shreyamahalle.github.io" style="text-decoration: none;">
    <img src="https://img.shields.io/badge/Portfolio-4285F4?style=for-the-badge&logo=google-chrome&logoColor=white" alt="Portfolio" height="28"/>
  </a>
</div>

<div align="center"> <sub>Built with ❤︎ by Shreya Mahalle</sub> </div> 

<div align="center">
  <sub>Made with ❤︎ by <strong>Shreya Mahalle</strong> | Powered by Java & Spring Boot ☕🌱</sub>  
  <br/>
  <sub>Let's connect on 
    <a href="https://github.com/shreyamahalle">GitHub</a> &bull; 
    <a href="https://linkedin.com/in/shreyamahalle">LinkedIn</a>
  </sub>
</div>



