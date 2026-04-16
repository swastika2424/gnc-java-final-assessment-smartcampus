# 📘 SmartCampus Management System (Java)

## 🏫 Project Overview
The **SmartCampus Management System** is a Java-based console application developed to manage students, courses, and enrollments efficiently.

This project demonstrates core Java concepts such as:
- Object-Oriented Programming (OOP)
- Collections Framework
- Exception Handling
- Multithreading
- Menu-driven application design

---

## 🎯 Problem Statement
The system allows an admin to:
- Manage students and courses  
- Enroll students into multiple courses  
- Handle invalid inputs using custom exceptions  
- Process enrollments asynchronously using threads  

---

## ⚙️ Features

### 👨‍🎓 Student Management
- Add new students  
- Store student details (ID, Name, Email)

### 📚 Course Management
- Add new courses  
- Store course details (Course ID, Name, Fee)

### 📝 Enrollment System
- A student can enroll in multiple courses  
- Uses `HashMap` and `ArrayList` for efficient storage  

### 📋 Menu Driven Program
- Add Student  
- Add Course  
- Enroll Student  
- View Students  
- View Enrollments  
- Exit  

### ⚠️ Exception Handling
- Handles invalid inputs  
- Custom exception: `InvalidFeeException`  

### ⚡ Multithreading
- Simulates enrollment processing using threads  

---

## 🛠️ Technologies Used
- Java  
- OOP Concepts  
- Java Collections Framework  
- Exception Handling  
- Multithreading  

---

## ▶️ How to Run

1. Open terminal in project folder  
2. Compile all files:
```bash
javac *.java
```

3. Run the program:
```bash
java SmartCampus
```

---

## 🧪 Sample Output
```
--- Smart Campus Menu ---
1. Add Student
2. Add Course
3. Enroll Student
4. View Students
5. View Enrollments
6. Exit

Enter choice: 1
Enter Student ID: 1
Enter Name: Swastika Sarraf
Enter Email: swastikasarraf56@gmail.com
Student Added!
```

## 🧠 Scenario-Based MCQs

### ✅ MCQ 1: Collections Design  
**Answer:** B. HashMap<Student, ArrayList<Course>>  
**Explanation:** This allows efficient mapping of each student to multiple courses with fast lookup.

---

### ✅ MCQ 2: Exception Handling  
**Answer:** C. Throw custom exception (InvalidFeeException)  
**Explanation:** Ensures proper validation and prevents invalid data like negative fee.

---

### ✅ MCQ 3: Multithreading Use Case  
**Answer:** B. Use synchronized block or thread-safe collection  
**Explanation:** Prevents inconsistent results when multiple threads access shared data.

---

### ✅ MCQ 4: OOP Design Decision  
**Answer:** B. Interface  
**Explanation:** Allows defining a common method with different implementations.

---

## 🚀 Unique Features
- Multithreaded enrollment processing  
- Custom exception handling for validation  

---

## 📌 Conclusion
This project demonstrates how Java concepts can be used to build a real-world application with efficient 
data handling, proper error management, and concurrency.

---

## 👨‍💻 Author
- **Name:** Swastika Sarraf  
- **Course:** B.Tech 2nd Year  
- **Project:** SmartCampus System  

---

## 🔗 GitHub Repository
Repository Name:  
`gnc-java-final-assessment-smartcampus`
