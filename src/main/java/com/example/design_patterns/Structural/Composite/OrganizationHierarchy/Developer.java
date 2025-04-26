package com.example.design_patterns.Structural.Composite.OrganizationHierarchy;

public class Developer implements Employee {

    private String name;
    private String position;

    public Developer(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(name + " (" + position + ")");
    }
}
