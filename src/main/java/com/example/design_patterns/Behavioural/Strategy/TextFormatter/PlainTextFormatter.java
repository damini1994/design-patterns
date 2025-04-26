package com.example.design_patterns.Behavioural.Strategy.TextFormatter;

public class PlainTextFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        return text;
    }
}
