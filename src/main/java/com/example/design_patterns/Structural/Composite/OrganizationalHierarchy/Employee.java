package com.example.design_patterns.Structural.Composite.OrganizationalHierarchy;

public class Employee implements EmployeeComponent {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void showDetails() {
        System.out.println(position + ": " + name);
    }
}
