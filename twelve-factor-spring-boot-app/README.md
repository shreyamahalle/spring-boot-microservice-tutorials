# Twelve Factor Spring Boot Application

This is a sample Spring Boot application demonstrating the [12-Factor App](https://12factor.net/) principles for building scalable and maintainable cloud-native applications.

---

## Features

- Single codebase managed with Git
- Dependency management with Maven (`pom.xml`)
- Configuration via environment variables or `application.properties`
- External backing services (database) accessed via URL configuration
- Build, release, and run lifecycle with Maven and Docker
- Stateless processes with no local file storage
- Port binding via configurable environment variable
- Supports scaling through container replicas (Docker/Kubernetes)
- Fast startup and graceful shutdown
- Consistent dev and production parity via environment variables
- Logging to stdout using SLF4J, suitable for container logging
- Database migrations managed automatically by Flyway

---



            ┌────────────────────────────────────────────┐
            │              Source Code                   │
            │   (1 Codebase: Git Repo for Spring Boot)   │
            └────────────────────────────────────────────┘
                            ↓
            ┌────────────────────────────────────────────┐
            │ (2) Dependencies in pom.xml (Maven)         │
            └────────────────────────────────────────────┘
                            ↓
            ┌────────────────────────────────────────────┐
            │ (3) Config: Use application.properties      │
            │     Or ENV variables in prod               │
            └────────────────────────────────────────────┘
                            ↓
            ┌────────────────────────────────────────────┐
            │ (4) Backing Services: MySQL, Redis, etc     │
            │     Connected via URL, not hardcoded        │
            └────────────────────────────────────────────┘
                            ↓
            ┌────────────────────────────────────────────┐
            │ (5) Build-Release-Run:                      │
            │     mvn clean install → build .jar          │
            │     java -jar app.jar (run phase)           │
            └────────────────────────────────────────────┘
                            ↓
            ┌────────────────────────────────────────────┐
            │ (6) Stateless Processes: No file saving     │
            └────────────────────────────────────────────┘
                            ↓
            ┌────────────────────────────────────────────┐
            │ (7) Port Binding: app runs on port 8080     │
            └────────────────────────────────────────────┘
                            ↓
            ┌────────────────────────────────────────────┐
            │ (8) Scale with replicas (Docker/K8s)        │
            └────────────────────────────────────────────┘
                            ↓
            ┌────────────────────────────────────────────┐
            │ (9) Quick Start/Stop: Spring Boot is fast   │
            └────────────────────────────────────────────┘
                            ↓
            ┌────────────────────────────────────────────┐
            │ (10) Dev/Prod Parity: same DB/ENV format    │
            └────────────────────────────────────────────┘
                            ↓
            ┌────────────────────────────────────────────┐
            │ (11) Logs: Use SLF4J to output to console   │
            │     Handled by Docker/K8s                   │
            └────────────────────────────────────────────┘
                            ↓
            ┌────────────────────────────────────────────┐
            │ (12) Admin Tasks: DB migration with Flyway  │
            └────────────────────────────────────────────┘

// Project Structure:
// com.example.twelvefactorapp
// ├── controller
// │   ├── HelloController.java
// │   └── LogController.java
// ├── service
// │   └── DemoService.java (optional for business logic)
// ├── config
// │   └── AppConfig.java (optional for advanced config)
// ├── util
// │   └── LoggerUtil.java (optional helpers)
// ├── model
// │   └── Demo.java
// └── migration
//     └── V1__init.sql

// ==========================================================================================
// ✅ 1. CODEBASE (One Codebase)
// Spring Boot app with Git-based version control (one repo for one app)

// ==========================================================================================
// ✅ 2. DEPENDENCIES (Declared Explicitly)
// pom.xml
<project>
<dependencies>
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-web</artifactId>
</dependency>
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
<groupId>org.flywaydb</groupId>
<artifactId>flyway-core</artifactId>
</dependency>
<dependency>
<groupId>com.h2database</groupId>
<artifactId>h2</artifactId>
</dependency>
<dependency>
<groupId>org.projectlombok</groupId>
<artifactId>lombok</artifactId>
<optional>true</optional>
</dependency>
</dependencies>
</project>

// ==========================================================================================
// ✅ 3. CONFIG (Stored in Environment)
/* application.properties */
spring.datasource.url=${DB_URL:jdbc:h2:mem:testdb}
spring.datasource.username=${DB_USER:sa}
spring.datasource.password=${DB_PASS:}
server.port=${PORT:8080}
logging.level.root=INFO

// ==========================================================================================
// ✅ 4. BACKING SERVICES (DB, Redis, Email etc.)
// Example using in-memory H2 as external DB service

// ==========================================================================================
// ✅ 5. BUILD, RELEASE, RUN
// Build: mvn clean install
// Release: docker build -t myapp .
// Run: docker run -p 8080:8080 -e DB_URL=... myapp

// ==========================================================================================
// ✅ 6. PROCESSES (Stateless and Share-Nothing)
/* controller/HelloController.java */
package com.example.twelvefactorapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
@GetMapping("/hello")
public String hello() {
return "Hello from 12-Factor App";
}
}

// ==========================================================================================
// ✅ 7. PORT BINDING
// app runs standalone, binds to port from ENV (application.properties)

// ==========================================================================================
// ✅ 8. CONCURRENCY
// scale app with multiple containers: docker run multiple replicas or use Kubernetes

// ==========================================================================================
// ✅ 9. DISPOSABILITY
// Spring Boot apps start fast and handle SIGTERM for clean shutdown

// ==========================================================================================
// ✅ 10. DEV/PROD PARITY
// same ENV variables used locally and in production

// ==========================================================================================
// ✅ 11. LOGS (Streams to STDOUT)
/* controller/LogController.java */
package com.example.twelvefactorapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogController {
@GetMapping("/log")
public String logDemo() {
log.info("This is a sample log message.");
return "Log printed!";
}
}

// ==========================================================================================
// ✅ 12. ADMIN PROCESSES (Run as One-Off)
// Flyway automatically runs DB migration on startup
// File: src/main/resources/db/migration/V1__init.sql
-- SQL file
CREATE TABLE demo (
id INT PRIMARY KEY,
name VARCHAR(50)
);

// ==========================================================================================
// ✅ MODEL LAYER (Optional if DB access needed)
/* model/Demo.java */
package com.example.twelvefactorapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Demo {
@Id
private int id;
private String name;
}

// ==========================================================================================
// ✅ MAIN CLASS
/* TwelveFactorAppApplication.java */
package com.example.twelvefactorapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TwelveFactorAppApplication {
public static void main(String[] args) {
SpringApplication.run(TwelveFactorAppApplication.class, args);
}
}

// ==========================================================================================
// ✅ OPTIONAL Dockerfile (for cloud deployment)
/* Dockerfile */
FROM openjdk:17
COPY target/twelvefactorapp.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]

// ==========================================================================================
// ✅ OPTIONAL: SERVICE LAYER (Optional logic)
/* service/DemoService.java */
package com.example.twelvefactorapp.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
public String process() {
return "Processed by service";
}
}

// ==========================================================================================
// ✅ OPTIONAL: CONFIG PACKAGE (future config beans)
/* config/AppConfig.java */
package com.example.twelvefactorapp.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
// define config beans here
}
