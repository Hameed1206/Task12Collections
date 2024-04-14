package com.example.hr;
//QUE 1

public class Employee {

    // Declare instance variables to store employee information
    String employeeName;    // Stores the name of the employee
    int employeeID;         // Stores the ID of the employee
    double employeeSalary;  // Stores the salary of the employee

    // Method to print the employee's name
    public void printName(String name){
        employeeName = name;  // Set the employeeName variable to the provided name
        System.out.println("Employee name is " + employeeName); // Print the employee's name
    }

    // Method to print the employee's ID
    public void printID(int id){
        employeeID = id;  // Set the employeeID variable to the provided ID
        System.out.println("Employee ID is " + employeeID); // Print the employee's ID
    }

    // Method to print the employee's salary
    public void printSalary(double salary){
        employeeSalary = salary;  // Set the employeeSalary variable to the provided salary
        System.out.println("Employee salary is " + employeeSalary); // Print the employee's salary
    }
}
