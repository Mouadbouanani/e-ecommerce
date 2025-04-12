# 🛍️ E-Commerce Website

## 📌 Project Overview

This is a full-stack e-commerce website built with **Spring Boot** (backend) and **Angular** (frontend). The system supports:

- Multiple user roles: **Client**, **Supplier**, **Admin**
- Product management
- Shopping cart functionality
- Order processing
- Payment tracking

---

## 🛠️ Technologies Used

### Backend

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- Hibernate (ORM)
- Jakarta Persistence (JPA)
- Maven (Dependency Management)
- H2 Database (Development)
- PostgresSQL (Production)

### Frontend

- Angular

---

## 🗄️ Database Schema

The application uses a relational database with the following key entities:

Users (Base) ├── Clients ├── Fournisseurs (Suppliers) └── Admins

Products ├── Categories (Many-to-Many) └── Fournisseurs (Many-to-One)

Orders ├── Clients (Many-to-One) ├── OrderItems └── Payments (One-to-One)

Carts ├── Clients (One-to-One) └── CartItems


---

## 🚀 Getting Started

### Prerequisites

- Java JDK 17+
- Maven 3.8+
- PostgresSQL 17+ (for production)
- Node.js & Angular CLI (for frontend)
- IDE (IntelliJ IDEA / Eclipse / VS Code)

### Installation

1. **Clone the Repository**

```bash
git clone https://github.com/yourusername/ecommerce-website.git
cd ecommerce-website
