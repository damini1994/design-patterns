package com.example.design_patterns.Behavioural.Strategy.TextFormatter;

public class StrategyPatternDemo2 {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(new PlainTextFormatter());
        editor.publishText("Hello, World!");

        // Change strategy to Markdown
        editor.setTextFormatter(new MarkdownFormatter());
        editor.publishText("Hello, World!");

        // Change strategy to HTML
        editor.setTextFormatter(new HTMLFormatter());
        editor.publishText("Hello, World!");
    }
}
