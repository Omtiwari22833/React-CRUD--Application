# 🚀 React-CRUD Application

> **Full-Stack Employee Management System** | ReactJS + Spring Boot + MySQL  
> A comprehensive CRUD application demonstrating modern web development practices with real-time data management.

---

## 📋 Table of Contents

- [Overview](#overview)
- [Architecture](#architecture)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [Installation & Setup](#installation--setup)
- [Application Flow](#application-flow)
- [API Endpoints](#api-endpoints)
- [Components](#components)
- [Troubleshooting](#troubleshooting)
- [Video Tutorial Series](#video-tutorial-series)

---

## 🎯 Overview

A full-stack CRUD (Create, Read, Update, Delete) application for managing employee records. This project demonstrates:

- **Frontend**: React with Bootstrap styling and React Router for navigation
- **Backend**: Spring Boot REST APIs with JPA/Hibernate
- **Database**: MySQL for persistent data storage
- **Communication**: Axios for HTTP requests

**Perfect for**: Learning full-stack development, understanding microservices, or building production-ready applications.

---

## 🏗️ Architecture

```
┌─────────────────────────────────────────────────────────────┐
│                    CLIENT LAYER (React)                      │
│  ┌──────────────────────────────────────────────────────┐   │
│  │  Header │ ListEmployee │ AddEmployee │ UpdateEmployee │   │
│  │          └─── React Router Navigation ───┘           │   │
│  └──────────────────────────────────────────────────────┘   │
└──────────────────┬──────────────────────────────────────────┘
                   │ Axios HTTP Requests
                   │ (JSON over REST)
                   ↓
┌─────────────────────────────────────────────────────────────┐
│              API GATEWAY & BACKEND (Spring Boot)             │
│  ┌──────────────────────────────────────────────────────┐   │
│  │  EmployeeController                                  │   │
│  │  ├── GET /api/employees                              │   │
│  │  ├── GET /api/employees/{id}                         │   │
│  │  ├── POST /api/employees                             │   │
│  │  ├── PUT /api/employees/{id}                         │   │
│  │  └── DELETE /api/employees/{id}                      │   │
│  └──────────────────────────────────────────────────────┘   │
└──────────────────┬──────────────────────────────────────────┘
                   │ JPA/Hibernate ORM
                   │ SQL Queries
                   ↓
┌─────────────────────────────────────────────────────────────┐
│               DATA PERSISTENCE (MySQL)                       │
│  ┌──────────────────────────────────────────────────────┐   │
│  │  employees Table                                     │   │
│  │  ├── id (Primary Key)                               │   │
│  │  ├── firstName                                      │   │
│  │  ├── lastName                                       │   │
│  │  ├── email                                          │   │
│  │  └── timestamps                                     │   │
│  └──────────────────────────────────────────────────────┘   │
└─────────────────────────────────────────────────────────────┘
```

---

## ✨ Features

| Feature | Description |
|---------|-------------|
| 📝 **List Employees** | View all employees in a clean table format |
| ➕ **Add Employee** | Create new employee records with form validation |
| ✏️ **Update Employee** | Modify existing employee information |
| 👁️ **View Details** | View complete employee profile |
| 🗑️ **Delete Employee** | Remove employee records from the system |
| 🎨 **Responsive UI** | Bootstrap 4 styling for mobile & desktop |
| 🔀 **Client-side Routing** | Seamless navigation using React Router |
| ⚡ **Real-time Updates** | Instant reflection of data changes |

---

## 🛠️ Tech Stack

### Frontend
- **React** 16.13.1 - UI Library
- **React Router DOM** 5.2.0 - Client-side routing
- **Axios** 0.19.2 - HTTP Client
- **Bootstrap** 4.5.0 - CSS Framework
- **React Scripts** 3.4.1 - Build tooling

### Backend
- **Spring Boot** 2.x - Application framework
- **Spring Data JPA** - ORM solution
- **Hibernate** - JPA implementation
- **MySQL Driver** - Database connectivity

### Database
- **MySQL** 8.0+ - Relational database

---

## 📁 Project Structure

```
React-CRUD--Application/
├── react-frontend/                    # React Application
│   ├── public/
│   │   └── index.html                 # HTML Entry Point
│   ├── src/
│   │   ├── components/
│   │   │   ├── HeaderComponent.js      # Navigation Header
│   │   │   ├── FooterComponent.jsx     # Page Footer
│   │   │   ├── ListEmployeeComponent.jsx      # List All Employees
│   │   │   ├── CreateEmployeeComponent.jsx    # Add New Employee
│   │   │   ├── UpdateEmployeeComponent.jsx    # Edit Employee
│   │   │   └── ViewEmployeeComponent.jsx      # View Employee Details
│   │   ├── services/
│   │   │   └── EmployeeService.js     # API Service Layer
│   │   ├── App.js                     # Main App Component
│   │   └── index.js                   # React Entry Point
│   └── package.json
│
├── springboot-backend/                # Spring Boot Application
│   ├── src/main/java/net/javaguides/springboot/
│   │   ├── SpringbootBackendApplication.java    # Main Class
│   │   ├── controller/
│   │   │   └── EmployeeController.java          # REST Endpoints
│   │   ├── model/
│   │   │   └── Employee.java                    # Entity Class
│   │   ├── repository/
│   │   │   └── EmployeeRepository.java          # Data Access Layer
│   │   └── exception/
│   │       └── ResourceNotFoundException.java   # Custom Exception
│   ├── src/main/resources/
│   │   └── application.properties               # Configuration
│   └── pom.xml
│
└── README.md
```

---

## 🚀 Installation & Setup

### Prerequisites
- **Node.js** 14+ & npm
- **Java** 8+ & Maven
- **MySQL** 8.0+

### Backend Setup (Spring Boot)

```bash
# Navigate to backend directory
cd springboot-backend

# Configure MySQL in application.properties
# Update: spring.datasource.username, spring.datasource.password, spring.datasource.url

# Build the project
mvn clean install

# Run the Spring Boot application
mvn spring-boot:run
# Server runs on: http://localhost:8080
```

### Frontend Setup (React)

```bash
# Navigate to frontend directory
cd react-frontend

# Install dependencies
npm install

# Set environment variable for legacy OpenSSL support (Node 17+)
# Windows PowerShell:
$env:NODE_OPTIONS="--openssl-legacy-provider"

# Start the development server
npm start
# App opens at: http://localhost:3000
```

---

## 🔄 Application Flow

### Employee List Flow
```
┌─────────────────┐
│   App Loads     │
└────────┬────────┘
         │
         ↓
┌──────────────────────────────────────┐
│  ListEmployeeComponent Mounts        │
│  (useEffect Hook Triggered)          │
└────────┬─────────────────────────────┘
         │
         ↓
┌──────────────────────────────────────┐
│  EmployeeService.getAllEmployees()   │
│  (HTTP GET to /api/employees)        │
└────────┬─────────────────────────────┘
         │
         ↓
┌──────────────────────────────────────┐
│  Backend EmployeeController          │
│  Queries Database via Repository     │
└────────┬─────────────────────────────┘
         │
         ↓
┌──────────────────────────────────────┐
│  MySQL Returns Employee Records      │
└────────┬─────────────────────────────┘
         │
         ↓
┌──────────────────────────────────────┐
│  Response Sent to Frontend (JSON)    │
└────────┬─────────────────────────────┘
         │
         ↓
┌──────────────────────────────────────┐
│  State Updated with Employee Data    │
│  Component Re-renders                │
└────────┬─────────────────────────────┘
         │
         ↓
┌──────────────────────────────────────┐
│  Table Displayed with All Employees  │
│  + Edit/Delete/View Buttons          │
└──────────────────────────────────────┘
```

### Create Employee Flow
```
┌──────────────────────────────────┐
│  User Clicks "Add Employee"      │
└────────┬─────────────────────────┘
         │
         ↓
┌──────────────────────────────────┐
│  Navigate to CreateEmployeeForm   │
└────────┬─────────────────────────┘
         │
         ↓
┌──────────────────────────────────┐
│  User Fills Form                 │
│  (firstName, lastName, email)    │
└────────┬─────────────────────────┘
         │
         ↓
┌──────────────────────────────────┐
│  User Clicks "Save"              │
│  Form Validation Triggered       │
└────────┬─────────────────────────┘
         │
         ↓
┌──────────────────────────────────┐
│  EmployeeService.createEmployee()│
│  (HTTP POST to /api/employees)   │
└────────┬─────────────────────────┘
         │
         ↓
┌──────────────────────────────────┐
│  Backend Processes Request       │
│  Saves to MySQL                  │
└────────┬─────────────────────────┘
         │
         ↓
┌──────────────────────────────────┐
│  Success Response + 201 Status   │
└────────┬─────────────────────────┘
         │
         ↓
┌──────────────────────────────────┐
│  Redirect to Employee List       │
│  New Employee Visible            │
└──────────────────────────────────┘
```

### Update Employee Flow
```
┌──────────────────────────────────┐
│  User Clicks "Edit" Button       │
└────────┬─────────────────────────┘
         │
         ↓
┌──────────────────────────────────┐
│  Fetch Employee Data by ID       │
│  GET /api/employees/{id}         │
└────────┬─────────────────────────┘
         │
         ↓
┌──────────────────────────────────┐
│  Populate Form with Data         │
└────────┬─────────────────────────┘
         │
         ↓
┌──────────────────────────────────┐
│  User Modifies Fields            │
└────────┬─────────────────────────┘
         │
         ↓
┌──────────────────────────────────┐
│  User Clicks "Update"            │
│  Form Validation                 │
└────────┬─────────────────────────┘
         │
         ↓
┌──────────────────────────────────┐
│  EmployeeService.updateEmployee()│
│  PUT /api/employees/{id}         │
└────────┬─────────────────────────┘
         │
         ↓
┌──────────────────────────────────┐
│  Backend Updates Record          │
│  Saves to MySQL                  │
└────────┬─────────────────────────┘
         │
         ↓
┌──────────────────────────────────┐
│  Success Response + 200 Status   │
└────────┬─────────────────────────┘
         │
         ↓
┌──────────────────────────────────┐
│  Redirect to List                │
│  Updated Data Displayed          │
└──────────────────────────────────┘
```

### Delete Employee Flow
```
┌──────────────────────────────────┐
│  User Clicks "Delete" Button     │
└────────┬─────────────────────────┘
         │
         ↓
┌──────────────────────────────────┐
│  Confirmation Dialog             │
│  "Are you sure?"                 │
└────────┬─────────────────────────┘
         │
         ↓
┌──────────────────────────────────┐
│  User Confirms                   │
└────────┬─────────────────────────┘
         │
         ↓
┌──────────────────────────────────┐
│  EmployeeService.deleteEmployee()│
│  DELETE /api/employees/{id}      │
└────────┬─────────────────────────┘
         │
         ↓
┌──────────────────────────────────┐
│  Backend Removes Record          │
│  DELETE from MySQL               │
└────────┬─────────────────────────┘
         │
         ↓
┌──────────────────────────────────┐
│  Success Response + 204 Status   │
└────────┬─────────────────────────┘
         │
         ↓
┌──────────────────────────────────┐
│  Remove from List View           │
│  Employee No Longer Visible      │
└──────────────────────────────────┘
```

---

## 🔌 API Endpoints

| Method | Endpoint | Description | Status |
|--------|----------|-------------|--------|
| **GET** | `/api/employees` | Retrieve all employees | ✅ 200 |
| **GET** | `/api/employees/{id}` | Get employee by ID | ✅ 200 |
| **POST** | `/api/employees` | Create new employee | ✅ 201 |
| **PUT** | `/api/employees/{id}` | Update employee | ✅ 200 |
| **DELETE** | `/api/employees/{id}` | Delete employee | ✅ 204 |

### Request/Response Example

**Create Employee**
```json
// POST /api/employees
{
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com"
}

// Response: 201 Created
{
  "id": 1,
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com"
}
```

---

## 🧩 Components

### ListEmployeeComponent
- Displays all employees in a table
- Provides Edit, Delete, and View buttons
- Auto-fetches data on component mount

### CreateEmployeeComponent
- Form for adding new employees
- Client-side validation
- Redirect to list on success

### UpdateEmployeeComponent
- Pre-fills form with existing data
- Handles employee record updates
- Back navigation on cancel

### ViewEmployeeComponent
- Read-only view of employee details
- Back button to list

### EmployeeService
- Centralized API communication
- Axios-based HTTP client
- Methods: getAllEmployees(), getEmployeeById(), createEmployee(), updateEmployee(), deleteEmployee()

---

## ⚡ Troubleshooting

### Issue: `npm start` fails with OpenSSL error
**Solution**: Set legacy OpenSSL provider
```powershell
$env:NODE_OPTIONS="--openssl-legacy-provider"
npm start
```

### Issue: Backend connection refused
**Solution**: Ensure Spring Boot is running on port 8080
```bash
# Check if running
netstat -an | findstr :8080

# Restart backend
cd springboot-backend
mvn spring-boot:run
```

### Issue: MySQL connection error
**Solution**: Verify database credentials in `application.properties`
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### Issue: CORS errors
**Solution**: Backend should have CORS enabled
```java
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/employees")
public class EmployeeController { ... }
```

---

## 📚 Video Tutorial Series

Complete step-by-step video tutorials available on YouTube:

| Episode | Topic | Link |
|---------|-------|------|
| 1 | Project Overview | [Watch](https://youtu.be/n43h1eJ2EUE) |
| 2 | Architecture & Development | [Watch](https://youtu.be/iK__liBIXWk) |
| 3 | Spring Boot & MySQL Setup | [Watch](https://youtu.be/k5KnAhkRzh4) |
| 4 | JPA Entity + Repository | [Watch](https://youtu.be/FZwLlaMmers) |
| 5 | List Employee REST API | [Watch](https://youtu.be/L57OlxU0fEE) |
| 6 | React App Creation | [Watch](https://youtu.be/tUXiPfNKUWE) |
| 7 | Bootstrap 4 Integration | [Watch](https://youtu.be/ArxBR9C1oNA) |
| 8 | React List Component | [Watch](https://youtu.be/Tpt9t5IV7Vw) |
| 9 | Connect React to API | [Watch](https://youtu.be/zXE7dCidXhc) |
| 10 | Header & Footer | [Watch](https://youtu.be/LOcy9uFzBBU) |
| 11 | Routing Configuration | [Watch](https://youtu.be/z2QAbWy1A40) |
| 12 | Add Employee REST API | [Watch](https://youtu.be/1y3pOPNrGms) |
| 13 | React Add Component | [Watch](https://youtu.be/E_7uVf0RCl4) |
| 14 | Form Handling | [Watch](https://youtu.be/S5AFJIfRxQU) |
| 15 | Connect Add to API | [Watch](https://youtu.be/ieMhlyjPjWo) |
| 16 | Get Employee by ID API | [Watch](https://youtu.be/L5SYbfkOTQA) |
| 17 | Update Employee API | [Watch](https://youtu.be/voJAjtioNN8) |
| 18 | React Update Component | [Watch](https://youtu.be/GrIG4-lnLkQ) |
| 19 | Connect Update to API | [Watch](https://youtu.be/uPCWBOrU6Vs) |
| 20 | Combined Add/Update | [Watch](https://youtu.be/ksvDBGF7JRE) |
| 21 | Delete Employee API | [Watch](https://youtu.be/dzgixz4X1KA) |
| 22 | Connect Delete to API | [Watch](https://youtu.be/L6wM7x0fqZs) |
| 23 | View Employee Component | [Watch](https://youtu.be/XRWnM51Cd7o) |
| 24 | View Page Design | [Watch](https://youtu.be/XRWnM51Cd7o) |
| 25 | Demo & Source Code | [Watch](https://youtu.be/FX5HE_gnOTI) |

---

## 📄 License

This project is open source and available for educational and commercial use.

---

## 🤝 Contributing

Contributions are welcome! Feel free to submit pull requests or open issues for bugs and feature requests.

---

## 💡 Key Concepts Demonstrated

- ✅ RESTful API Design
- ✅ Full-Stack Architecture
- ✅ React Hooks & State Management
- ✅ Component Lifecycle
- ✅ HTTP Client Integration (Axios)
- ✅ Client-side Routing
- ✅ Form Validation
- ✅ Database Design & JPA
- ✅ Spring Boot MVC Pattern
- ✅ Exception Handling

---

**Happy Coding! 🚀** | Built with ❤️ for learning full-stack development
