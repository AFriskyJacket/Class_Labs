package com.perscholas.java_basics;

import java.util.ArrayList;
import java.util.Objects;

public class Employee {
    public static void main(String[] args) {
        Employee test1 = new Employee("jason", "Dawson", "it");
        Employee test2 = new Employee("jason", "Dawson", "it");
        System.out.println(test1);
        String[] employeeList = {"Harold Riddle production", "Luciano Zavala r&d"};
        ArrayList<Employee> testList = Employee.addEmployees(employeeList);
        System.out.println(testList);
        System.out.println(test1.equals(test2));
    }
    private String firstName;
    private String lastName;
    private String department;

    public Employee(){
        firstName = "";
        lastName = "";
        department = "";
    }
    public Employee(String firstName, String Lastname, String department) {
        this.firstName = firstName;
        this.lastName = Lastname;
        this.department = department;
    }
    @Override
    public String toString() {
        System.out.println(firstName + " " + lastName + " " + department);
        return firstName + " " + lastName + " " + department;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj.getClass().equals(Employee.class)){
            Employee tester = (Employee) obj;
            if (this.firstName.equals(tester.firstName)){
                if (this.lastName.equals(tester.lastName)){
                    if (this.department.equals(tester.department)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    /*public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(department, employee.department);
    }*/

    public static ArrayList<Employee> addEmployees(String[] employeeList){
        ArrayList<Employee> newList = new ArrayList<>();
        for (String employeeInfo:employeeList){
            String[] nextEmployee = employeeInfo.split(" ");
            newList.add(new Employee(nextEmployee[0], nextEmployee[1], nextEmployee[2]));
        }
        return newList;
    }
}