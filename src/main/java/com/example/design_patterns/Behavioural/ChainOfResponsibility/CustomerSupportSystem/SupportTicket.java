package com.example.design_patterns.Behavioural.ChainOfResponsibility.CustomerSupportSystem;

public class SupportTicket {
    private String description;
    private Severity severity;

    public enum Severity {
        LOW, MEDIUM, HIGH, CRITICAL
    }

    public SupportTicket(String description, Severity severity) {
        this.description = description;
        this.severity = severity;
    }

    public String getDescription() {
        return description;
    }

    public Severity getSeverity() {
        return severity;
    }
}
