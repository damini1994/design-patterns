package com.example.design_patterns.Behavioural.Strategy.TextFormatter;

public class TextEditor {
    private TextFormatter textFormatter;

    public TextEditor(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    public void setTextFormatter(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    public void publishText(String text) {
        String formattedText = textFormatter.format(text);
        System.out.println("Published Text: " + formattedText);
    }
}
