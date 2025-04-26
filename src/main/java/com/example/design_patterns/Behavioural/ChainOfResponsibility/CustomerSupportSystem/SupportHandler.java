package com.example.design_patterns.Behavioural.ChainOfResponsibility.CustomerSupportSystem;

public abstract class SupportHandler {
    protected SupportHandler successor;

    public void setSuccessor(SupportHandler successor) {
        this.successor = successor;
    }

    protected abstract void handleRequest(SupportTicket ticket);
}
