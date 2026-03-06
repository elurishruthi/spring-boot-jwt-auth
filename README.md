## 🌍 Live Demo

https://spring-boot-jwt-auth-uk9t.onrender.com

# 🔐 Spring Boot JWT Authentication API

A production-style authentication system built using Spring Boot 3 and Spring Security 6.

This project demonstrates secure user registration, login, JWT token generation, token validation using a custom filter, and protected REST endpoints with stateless authentication.

---

## 🚀 Features

- User Registration & Login
- JWT Token Generation & Validation
- Stateless Authentication (No Sessions)
- Custom JWT Authentication Filter
- BCrypt Password Encryption
- Protected REST Endpoints
- DTO-based Clean Architecture
- Input Validation (Jakarta Validation)
- Global Exception Handling
- Structured JSON Responses
- File-based H2 Database (Development)

---

## 🛠 Tech Stack

- Java 17
- Spring Boot 3
- Spring Security 6
- JWT (jjwt)
- Spring Data JPA
- H2 Database
- Maven

---

## 🔐 Authentication Flow

1. User registers (password encrypted using BCrypt)
2. User logs in
3. Server generates JWT token
4. Client sends token in header:

```
Authorization: Bearer <token>
```

5. Custom JWT filter validates token before granting access

---

## 📌 API Endpoints

### 🔹 Register

**POST** `/api/auth/register`

Request:
```json
{
  "username": "shruthi",
  "email": "shruthi@test.com",
  "password": "123456"
}
```

Response:
```json
{
  "message": "User registered successfully"
}
```

---

### 🔹 Login

**POST** `/api/auth/login`

Request:
```json
{
  "username": "shruthi",
  "password": "123456"
}
```

Response:
```json
{
  "token": "eyJhbGciOiJIUzI1NiJ9..."
}
```

---

### 🔹 Protected Endpoint

**GET** `/api/user/profile`

Header:
```
Authorization: Bearer <token>
```

Response:
```json
{
  "username": "shruthi"
}
```

---

## ❌ Error Handling

### Validation Error Example

```json
{
  "username": "must not be blank",
  "email": "must be a well-formed email address"
}
```

### Business Error Example

```json
{
  "status": 400,
  "message": "Invalid password"
}
```

---

## ▶️ Run Locally

```bash
./mvnw clean
./mvnw spring-boot:run
```

Server runs on:

```
http://localhost:8080
```

---

## 👩‍💻 Author

Shruthi Eluri  
Java Backend Developer | Spring Boot | REST APIs
