# Assignment 1 – Student Management System

# Project Overview
This project is a Java-based Student Management System developed as part of Assignment 1.
The goal of the project is to demonstrate fundamental Object-Oriented Programming (OOP)
concepts in Java, including classes, objects, encapsulation, constructors, methods,
and arrays of objects.

The program creates multiple students, updates their GPA and earned credits, assigns
them to a course, and performs basic data processing such as calculating the average GPA,
finding the top-performing student, counting honors students, and summing total credits.



# Class Descriptions

# Student Class
The `Student` class represents an individual student.
It contains private fields for the student's name, ID, major, GPA, and total earned credits.
The constructor initializes the student with basic information and sets default values
for GPA and credits.

Encapsulation is enforced using getters and setters.
Additional methods allow updating GPA, adding credits, checking honors status, and
returning a formatted string representation of the student.

# Course Class
The `Course` class represents an academic course and demonstrates composition by
containing an array of `Student` objects.
It stores the course name, instructor, and enrolled students.

The class provides methods to add students, calculate the average GPA of the course,
and determine the student with the highest number of credits.



# How to Compile and Run
Navigate to the `src` directory and run the following commands:

```bash
javac *.java
java Main
