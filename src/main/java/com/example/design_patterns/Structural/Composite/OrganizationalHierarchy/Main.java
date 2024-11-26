package com.example.design_patterns.Structural.Composite.OrganizationalHierarchy;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", "Developer");
        Employee emp2 = new Employee("Bob", "Designer");
        Employee emp3 = new Employee("Charlie", "Tester");

        Manager mgr1 = new Manager("David", "Team Lead");
        mgr1.addSubordinate(emp1);
        mgr1.addSubordinate(emp2);

        Manager mgr2 = new Manager("Eve", "Project Manager");
        mgr2.addSubordinate(mgr1);
        mgr2.addSubordinate(emp3);

        mgr2.showDetails();
    }
}

//Output
//Project Manager: Eve
//Team Lead: David
//Developer: Alice
//Designer: Bob
//Tester: Charlie
