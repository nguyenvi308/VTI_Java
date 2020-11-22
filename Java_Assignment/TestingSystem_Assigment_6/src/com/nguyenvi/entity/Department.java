package com.nguyenvi.entity;

import com.nguyenvi.backend.ScannerUtils;

public class Department {
    private int id;
    private String name;

    private static final ScannerUtils scanner = new ScannerUtils();
    public Department() throws Exception {
        this.id = scanner.inputInt() ;
        scanner.nextLine();
        this.name = scanner.inputString();
    }
    public Department(int id, String name)
    {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
