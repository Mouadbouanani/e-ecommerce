# 🛍️ E-Commerce Website

## 📌 Project Overview

This is a full-stack e-commerce website developed using **Spring Boot** for the backend and **Angular** for the frontend. The system is designed to handle multiple user roles, including **Client**, **Supplier**, and **Administrator**, each with tailored access and functionalities. Key features include comprehensive **product management**, **shopping cart operations**, **order processing**, and **payment tracking**. The platform also supports secure **authentication**, responsive design for mobile compatibility, and can be extended with RESTful APIs for third-party integration.
- Multiple user roles: **Client**, **Supplier**, **Admin**
- Product management
- Shopping cart functionality
- Order processing
- Payment tracking

---

## 🛠️ Technologies Used

### Backend

 Java 17
 Spring Boot 3.x
 Spring Data JPA
 Hibernate (ORM)
 Jakarta Persistence (JPA)
 Maven (Dependency Management)
 H2 Database (Development)
 PostgresSQL (Production)

### Frontend

- Angular

### 🗄️ Database Schema

The application uses a relational database with the following key entities:

<pre>
Users (Base)
├── Clients
├── Fournisseurs (Suppliers)
└── Admins

Products
├── Categories (Many-to-Many)
└── Fournisseurs (Many-to-One)

Orders
├── Clients (Many-to-One)
├── OrderItems
└── Payments (One-to-One)

Carts
├── Clients (One-to-One)
└── CartItems
</pre>
---

## 🚀 Getting Started

### Prerequisites

- Java JDK 17+
- Maven 3.8+
- PostgresSQL 17+ (for production)
- Node.js & Angular CLI (for frontend)
- IDE (IntelliJ IDEA / Eclipse / VS Code)

### Installation

1. **Fork the Repository**

Go to the original repository and click **Fork** to create your own copy.

2. **Clone Your Forked Repository**

```bash
git clone https://github.com/Mouadbouanani/e-ecommerce.git
cd e-ecommerce

