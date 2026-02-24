# Spring Boot JWT Authentication API

## Features
- User Registration
- User Login
- JWT Token Generation
- JWT Token Validation
- Stateless Authentication
- Protected Endpoints
- BCrypt Password Encryption
- H2 File-Based Database

## Tech Stack
- Java 17
- Spring Boot 3
- Spring Security 6
- JWT (jjwt)
- H2 Database

## Endpoints

### Register
POST /api/auth/register

### Login
POST /api/auth/login

### Protected
GET /api/user/profile

Requires:
Authorization: Bearer <token>
