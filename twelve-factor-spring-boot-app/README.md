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

# Project Structure:
```
 com.example.twelvefactorapp
 ├── controller
 │   ├── HelloController.java
 │   └── LogController.java
 ├── service
 │   └── DemoService.java (optional for business logic)
 ├── config
 │   └── AppConfig.java (optional for advanced config)
 ├── util
 │   └── LoggerUtil.java (optional helpers)
 ├── model
 │   └── Demo.java
 └── migration
     └── V1__init.sql
```
