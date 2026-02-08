📦 Inventory Management System (Hibernate)
📌 Project Overview

This is a Core Java + Hibernate based Inventory Management System developed as a learning project to understand Hibernate ORM, entity mapping, and database operations using the Criteria API.

The project performs CRUD operations and advanced inventory-related queries such as filtering, aggregation, grouping, and sorting of products stored in a relational database.

🛠️ Technologies Used

Java (JDK 8)

Hibernate ORM

Maven

MySQL (or any RDBMS supported by Hibernate)

Eclipse IDE

🧩 Project Features

Add single or multiple products

Update product details by ID

Delete products from inventory

Fetch products by:

ID

Category

Name

Price conditions (greater than, less than, between)

Inventory analytics:

Total product count

Average product price

Maximum & minimum priced products

Category-wise product count

Category-wise average price

Warranty-wise product grouping

Total inventory value

Stock analysis:

Available products

Out-of-stock products

Highest & lowest stock products

🏗️ Project Structure
Inventory_Management_System
│
├── src/main/java
│   ├── com.product.entity        (Entity classes)
│   ├── com.product.repo          (Hibernate repository layer)
│   ├── com.product.controller    (Controller layer)
│   ├── com.product.util          (Hibernate utility)
│   └── com.product               (Main application)
│
├── src/main/resources
│   └── hibernate.cfg.xml
│
├── pom.xml
└── README.md


▶️ How to Run the Project

Clone or download the repository

Import as a Maven Project in Eclipse

Configure database details in hibernate.cfg.xml

Run the InventoryApp class

Check console output for query results

🎯 Learning Outcomes

Understanding Hibernate configuration and SessionFactory

Entity mapping and CRUD operations

Criteria API usage for complex queries

Aggregation and grouping operations in ORM

Clean separation of layers (Entity, Repository, Controller)

🚀 Future Improvements

Migrate Criteria API to JPQL / HQL

Convert project to Spring Boot

Expose functionality using REST APIs

Add exception handling and logging
