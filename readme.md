# 🚗 Car Showroom Management System

A simple **Java Console-Based Car Showroom Management System** built using Object-Oriented Programming (OOP) concepts. This project allows users to manage showroom details, employee records, and car inventory through a menu-driven interface.

## 📌 Features

* Add Showroom Details
* Add Employee Details
* Add Car Details
* Display Showroom Information
* Display Employee Information
* Display Car Information
* Menu-Driven Console Interface

---

## 🛠 Technologies Used

* Java
* OOP Concepts
* Arrays
* Interfaces
* Inheritance
* Method Overriding
* Scanner Class
* Console-Based UI

---

## 📂 Project Structure

```text
Car_Showroom_Management/
│
├── Main.java
├── Showroom.java
├── Employees.java
├── Car.java
└── utility.java
```

---

## 🏗 OOP Concepts Implemented

### 1. Interface

The `utility` interface defines common methods:

```java
interface utility {
    void get_details();
    void set_details();
}
```

### 2. Inheritance

* `Employees` extends `Showroom`
* `Car` extends `Showroom`

This allows code reusability and demonstrates inheritance.

### 3. Method Overriding

Each class provides its own implementation of:

```java
set_details()
get_details()
```

### 4. Encapsulation

Data members and methods are grouped inside classes to represent real-world entities.

---

## 📋 Menu Options

```text
1. Enter Showroom Details
2. Enter Employee Details
3. Enter Car Details
4. Show Showroom Details
5. Show Employee Details
6. Show Car Details
9. Back to Main Menu
0. Exit
```

---

## 🚀 How to Run

### Clone the Repository

```bash
git clone https://github.com/your-username/car-showroom-management.git
```

### Navigate to Project Directory

```bash
cd car-showroom-management
```

### Compile Java Files

```bash
javac *.java
```

### Run the Program

```bash
java Main
```

---

## 📸 Sample Output

```text
........Welcome to the car management showroom ........

1. Enter the Showroom details
2. Enter the Employee details
3. Enter the Car details
4. Show Showroom details
5. Show Employee details
6. Show Car details

Enter Choice:
```

---

## 🔮 Future Improvements

* Store data using ArrayList instead of Arrays
* Add Search Functionality
* Update and Delete Records
* File Handling for Permanent Data Storage
* Database Integration (MySQL)
* GUI using Java Swing or JavaFX
* Employee Salary Management
* Car Sales and Billing Module

---

## 🎯 Learning Outcomes

Through this project, I learned:

* Object-Oriented Programming in Java
* Interfaces and Inheritance
* Method Overriding
* Array Handling
* Menu-Driven Program Design
* Real-World Class Modeling

---

## 👨‍💻 Author

**Charchit Panchal**

Java Developer | Learning DSA & Backend Development

If you found this project useful, consider giving it a ⭐ on GitHub!
