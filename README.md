# Gallerist – Car Dealership Management System

A backend REST API for managing a car dealership's vehicle inventory and sales operations, built with Java and Spring Boot. Supports transactions in both TRY and USD, with live exchange rate conversion and JWT-secured access control.

## Features

- **Vehicle inventory management** — add, update, remove, and list vehicles available for sale
- **Sales processing** — record and track vehicle sales transactions
- **Real-time currency conversion** — dynamically converts prices between TRY and USD using a live exchange rate source
- **JWT authentication** — secured endpoints with token-based auth and role-based access control
- **Docker Integration** — fully containerized application and database environment using Docker Compose
- **Automated tests** — unit/integration test coverage for core business logic

## Tech Stack

| Layer | Technology |
|---|---|
| Language | Java 17 |
| Framework | Spring Boot |
| Security | Spring Security + JWT |
| Data Access | Spring Data JPA / Hibernate |
| Database | PostgreSQL |
| Containerization | Docker & Docker Compose |
| Build Tool | Maven |
| Testing | JUnit |

## Architecture

The project follows a layered architecture:

- **Controller layer** — exposes REST endpoints, handles request/response mapping
- **Service layer** — contains business logic (e.g. sale processing, currency conversion)
- **Repository layer** — Spring Data JPA repositories for persistence
- **Security layer** — JWT filter chain for authentication and authorization
- **Entity layer** — domain models: `Account`, `Address`, `Car`, `Customer`, `Gallerist` (dealership), and `GalleristCar` (the association between a dealership and the vehicles it has listed), mapped to PostgreSQL tables

## API Overview

| Method | Endpoint | Description |
|---|---|---|
| POST | `/rest/api/auth/register` | Register a new user account |
| POST | `/rest/api/auth/authenticate` | Log in and receive a JWT access token |
| POST | `/rest/api/auth/refreshToken` | Obtain a new access token using a refresh token |
| GET/PUT | `/rest/api/account` | View or update the authenticated user's account details |
| GET/POST/PUT/DELETE | `/rest/api/address` | Manage address records linked to customers and dealerships |
| GET/POST/PUT/DELETE | `/rest/api/customer` | CRUD operations on customer records |
| GET/POST/PUT/DELETE | `/rest/api/car` | CRUD operations on individual vehicles in inventory |
| GET/POST/PUT/DELETE | `/rest/api/gallerist` | CRUD operations on dealership (gallerist) records |
| GET/POST/PUT/DELETE | `/rest/api/gallerist-car` | Manage which vehicles are listed under which dealership, including sale price and TRY/USD conversion |

## Getting Started

### Prerequisites

- [Docker Engine](https://docs.docker.com/get-docker/) & [Docker Compose](https://docs.docker.com/compose/install/)
- *(Optional for local development)* Java 17+ & Maven

### Run with Docker (Recommended)

You don't need to install Java or PostgreSQL locally. You can spin up both the application and the PostgreSQL database with a single command:

1. Clone the repository:
   ```bash
   git clone [https://github.com/Loursy/Gallerist.git](https://github.com/Loursy/Gallerist.git)
   cd Gallerist
