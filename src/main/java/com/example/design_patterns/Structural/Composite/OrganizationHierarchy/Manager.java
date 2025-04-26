package com.example.design_patterns.Structural.Composite.OrganizationHierarchy;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
    private String name;
    private String position;
    private List<Employee> subordinates = new ArrayList<>();

    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
    }

    // Add subordinates
    public void addEmployee(Employee emp) {
        subordinates.add(emp);
    }

    // Remove subordinates
    public void removeEmployee(Employee emp) {
        subordinates.remove(emp);
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(name + " (" + position + ")");
        for (Employee e : subordinates) {
            e.showEmployeeDetails();
        }
    }
}
