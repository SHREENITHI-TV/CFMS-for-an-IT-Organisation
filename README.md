# 🏢 Customer Feedback Management System (CFMS)
[![Java](https://img.shields.io/badge/Java-8%2B-orange)](#)
[![NetBeans](https://img.shields.io/badge/IDE-Apache%20NetBeans-blue)](#)
[![MySQL](https://img.shields.io/badge/Database-MySQL-lightblue)](#)
[![Desktop App](https://img.shields.io/badge/Application-Desktop-green)](#)

A **Java Swing-based desktop application** that enables IT organizations to **collect, manage, and analyze customer feedback** using a structured, database-driven system.

---

## 📌 Overview

The **Customer Feedback Management System (CFMS)** is designed to help IT organizations centralize customer reviews, manage company information, and monitor feedback efficiently through a secure and interactive desktop application.

This project demonstrates the integration of **GUI development, database connectivity, and authentication** in a real-world software system.

---

## ✨ Features

- 🔐 User and Admin login system  
- 🏢 Manage IT organization/company details  
- 📝 Submit customer feedback and reviews  
- 📋 View, manage, and delete feedback  
- 🗄 Persistent data storage using MySQL  
- 🖥 Interactive desktop GUI built with Java Swing  

---

## 🧰 Technology Stack

- **Java (Swing)**
- **Apache NetBeans IDE**
- **MySQL**
- **JDBC**
- **Ant (build system)**

---

## ▶ How to Run the Project

### ✅ Prerequisites
Make sure the following are installed:
- Java JDK 8 or higher  
- Apache NetBeans IDE  
- MySQL Server (XAMPP / WAMP / MySQL Workbench)

---

### 🗄 Step 1: Database Setup

1. Start the MySQL server
2. Create a database (example: `cfms`)
3. Import the SQL files provided in the project root:
   - `admin_user.sql`
   - `it_organizations.sql`
   - `it_organization_reviews.sql`
   - `deleted_reviews.sql`

These scripts create the required tables and schema for the application.

---

### 🧩 Step 2: Open the Project in NetBeans

1. Open **Apache NetBeans IDE**
2. Go to **File → Open Project**
3. Select the `CFMS-for-an-IT-Organisation-master` folder
4. Click **Open Project**

---

### ▶ Step 3: Run the Application

1. In the **Projects** panel, right-click the project
2. Click **Run**

✅ NetBeans automatically executes the main class  
`CustomerFeedbackManagementSystem.java` and launches the application.

---

## 🧭 Application Flow

1. Login (Admin / User)
2. Home dashboard
3. IT organization management
4. Feedback submission and review
5. Admin moderation and data management

---

## 🎯 Use Cases

- Java Swing & JDBC learning  
- Desktop-based feedback systems  
- Database-driven application design  

---

## 📎 Notes

- Database credentials are configured in the source code.
- The project is intended to be run using **Apache NetBeans**, which manages build and execution automatically.

---
