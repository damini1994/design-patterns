package com.example.design_patterns.Behavioural.Strategy.TextFormatter;

public class HTMLFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        return "<strong>" + text + "</strong>"; // Example: bold text in HTML
    }
}
