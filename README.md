# Smart Run Planner – Backend

The Smart Run Planner backend is a Spring Boot REST API that powers a personalized running schedule system.  
It focuses on **availability-aware planning**, **recovery-conscious suggestions**, and **adaptive logic** based on how a user feels day to day.

This service handles all business logic and data modeling required to generate intelligent run recommendations.

---

## Core Responsibilities

- Store user availability (work schedule, buffer times, days off)
- Accept daily check-ins (energy, soreness, motivation)
- Determine suitable run types (recovery, short, long, tempo, sprint, rest)
- Enforce constraints to reduce injury risk and burnout
- Expose REST endpoints for frontend consumption

---

## Tech Stack

- Java
- Spring Boot
- Spring Web (REST APIs)
- Spring Data JPA
- Hibernate ORM
- H2 (in-memory database for development)
- Maven

---

## Architecture Overview

- **Controller layer**  
  Handles HTTP requests and responses

- **Model layer**  
  Defines domain entities (e.g. DailyAvailability)

- **Repository layer**  
  Handles persistence using Spring Data JPA

- **Business logic layer (in progress)**  
  Will evaluate availability, energy, soreness, and goals to rank run suggestions

---

## Example Endpoints

| Method | Endpoint | Description |
|------|---------|-------------|
| GET | `/api/health` | Health check |
| POST | `/api/availability` | Create daily availability |

---

## Running the Backend

```bash
./mvnw spring-boot:run
