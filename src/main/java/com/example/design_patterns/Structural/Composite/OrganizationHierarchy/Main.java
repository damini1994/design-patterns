package com.example.design_patterns.Structural.Composite.OrganizationHierarchy;

public class Main {
    public static void main(String[] args) {
        Employee dev1 = new Developer("John", "Senior Developer");
        Employee dev2 = new Developer("Jane", "Junior Developer");
        Employee des1 = new Designer("Lucy", "UI Designer");

        Manager manager1 = new Manager("Mike", "Team Manager");
        manager1.addEmployee(dev1);
        manager1.addEmployee(dev2);

        Manager manager2 = new Manager("Anna", "Design Manager");
        manager2.addEmployee(des1);

        Manager director = new Manager("David", "Director");
        director.addEmployee(manager1);
        director.addEmployee(manager2);

        // Display all employee details under the director
        director.showEmployeeDetails();
    }
}
//OUTPUT

//David (Director)
//Mike (Team Manager)
//John (Senior Developer)
//Jane (Junior Developer)
//Anna (Design Manager)
//Lucy (UI Designer)

