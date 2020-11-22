package com.nguyenvi.entity;

// Exercise 4 Question 1
public class Salary<N extends Number> {

    private N salary;

    public Salary(N salary) {
        this.salary = salary;
    }

    public N getSalary() {
        return salary;
    }

    public void setSalary(N salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return salary.toString();
    }
}
