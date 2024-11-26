package com.example.design_patterns.Structural.Composite.OrganizationalHierarchy;

import java.util.ArrayList;
import java.util.List;

public class Manager implements EmployeeComponent {
    private String name;
    private String position;
    private List<EmployeeComponent> subordinates = new ArrayList<>();

    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void addSubordinate(EmployeeComponent employee) {
        subordinates.add(employee);
    }

    public void removeSubordinate(EmployeeComponent employee) {
        subordinates.remove(employee);
    }

    @Override
    public void showDetails() {
        System.out.println(position + ": " + name);
        for (EmployeeComponent subordinate : subordinates) {
            subordinate.showDetails();
        }
    }
}
