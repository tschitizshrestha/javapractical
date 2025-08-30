package com.javapractical.employee;

public class PayrollSystem {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(1, "David", 30000, 5000);
        Employee e2 = new PartTimeEmployee(2, "Daniel", 70, 300);

        System.out.println(e1.name + " Salary: " + e1.calculateSalary());
        System.out.println(e2.name + " Salary: " + e2.calculateSalary());
    }
}
