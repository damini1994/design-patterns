package com.example.design_patterns.Behavioural.Strategy.TextFormatter;

public class MarkdownFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        return "**" + text + "**"; // Example: bold text in Markdown
    }
}
