# Spring Boot JWT Authentication API

A production-style authentication system built using Spring Boot 3 and Spring Security 6.

This project implements secure user registration, login, JWT token generation, token validation, and protected REST endpoints using stateless authentication.

---

## 🚀 Features

- User Registration
- User Login
- JWT Token Generation
- JWT Token Validation via Custom Filter
- Stateless Authentication (No Sessions)
- BCrypt Password Encryption
- Protected API Endpoints
- DTO-based Request/Response Design
- Input Validation using Jakarta Validation
- Global Exception Handling
- Structured JSON Responses
- File-based H2 Database

---

## 🛠 Tech Stack

- Java 17
- Spring Boot 3
- Spring Security 6
- JWT (jjwt)
- Spring Data JPA
- H2 Database (file-based)
- Maven

---

## 📂 Project Structure
com.shruthi.jwtauth
│
├── controller
├── dto
├── entity
├── repository
├── security
│ ├── JwtService
│ ├── JwtAuthenticationFilter
│ └── SecurityConfig
│
└── GlobalExceptionHandler

---

## 🔐 Authentication Flow

1. User registers
2. Password is encrypted using BCrypt
3. User logs in
4. JWT token is generated
5. Token must be sent in Authorization header:
Authorization: Bearer <token>
6. Protected endpoints validate JWT before granting access

---

## 📌 API Endpoints

### 🔹 Register User

**POST** `/api/auth/register`

Request:
```json
{
"username": "shruthi",
"email": "shruthi@test.com",
"password": "123456"
}
Response:
{
  "message": "User registered successfully"
}
🔹 Login

POST /api/auth/login

Request:
{
  "username": "shruthi",
  "password": "123456"
}
Response:
{
  "token": "eyJhbGciOiJIUzI1NiJ9..."
}
🔹 Access Protected Endpoint

GET /api/user/profile

Header:
Authorization: Bearer <token>
Response:
{
  "username": "shruthi"
}
❌ Error Handling
Validation Error Example
{
  "username": "must not be blank",
  "email": "must be a well-formed email address",
  "password": "must not be blank"
}
Business Error Example
{
  "status": 400,
  "message": "Invalid password"
}
🧠 Key Concepts Demonstrated

Stateless REST API Security

Custom JWT Authentication Filter

Spring Security Filter Chain Configuration

Secure Password Storage

Clean Architecture using DTO Layer

Centralized Exception Handling

Proper HTTP Status Code Usage
▶️ Run Locally
./mvnw clean
./mvnw spring-boot:run
Server runs on:

http://localhost:8080

🔮 Future Improvements

Role-Based Authorization (ADMIN / USER)

Refresh Token Support

PostgreSQL Migration

Dockerization

API Documentation (Swagger)
📌 Author

Shruthi Eluri
Backend Developer | Java | Spring Boot