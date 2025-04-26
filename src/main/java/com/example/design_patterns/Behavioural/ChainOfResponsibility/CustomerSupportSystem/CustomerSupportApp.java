package com.example.design_patterns.Behavioural.ChainOfResponsibility.CustomerSupportSystem;

public class CustomerSupportApp {
    public static void main(String[] args) {
        SupportHandler level1 = new Level1Support();
        SupportHandler level2 = new Level2Support();
        SupportHandler level3 = new Level3Support();

        level1.setSuccessor(level2);
        level2.setSuccessor(level3);

        SupportTicket ticket1 = new SupportTicket("Cannot reset password", SupportTicket.Severity.LOW);
        SupportTicket ticket2 = new SupportTicket("Application crashes on startup", SupportTicket.Severity.MEDIUM);
        SupportTicket ticket3 = new SupportTicket("Data breach detected", SupportTicket.Severity.HIGH);
        SupportTicket ticket4 = new SupportTicket("General inquiry", SupportTicket.Severity.LOW);
        SupportTicket ticket5 = new SupportTicket("Unknown severity issue", SupportTicket.Severity.valueOf("HIGH"));
        SupportTicket ticket6 = new SupportTicket("Critical severity issue", SupportTicket.Severity.CRITICAL);

        level1.handleRequest(ticket1);
        level1.handleRequest(ticket2);
        level1.handleRequest(ticket3);
        level1.handleRequest(ticket4);
        level1.handleRequest(ticket5);
        level1.handleRequest(ticket6);
    }
}
