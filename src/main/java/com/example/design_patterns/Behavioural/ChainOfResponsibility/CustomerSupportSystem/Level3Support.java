package com.example.design_patterns.Behavioural.ChainOfResponsibility.CustomerSupportSystem;

public class Level3Support extends SupportHandler{

    @Override
    protected void handleRequest(SupportTicket ticket) {
        if(ticket.getSeverity() == SupportTicket.Severity.HIGH){
            System.out.println("Level 3 Support handled ticket: " + ticket.getDescription());
        } else {
            if (successor != null) {
                successor.handleRequest(ticket);
            } else {
                System.out.println("No handler available for ticket: " + ticket.getDescription());
            }
        }
    }
}
