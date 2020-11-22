package com.nguyenvi.entity;

import java.time.LocalDate;
import java.util.Date;

public class Student1 implements Comparable<Student1> {
    // có property id, name, ngày sinh, điểm
    private int id;
    private String name;
    private LocalDate dateOfBirth;
    private double grade;

    public Student1(int id, String name, LocalDate dateOfBirth,double grade) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Student1 o) {
        return this.name.compareTo(o.getName());

    }

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", grade=" + grade +
                '}';
    }
}
