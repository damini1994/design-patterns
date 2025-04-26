package com.example.design_patterns.Structural.Composite.GUIComponent;

public class TextField implements GUIComponent {
    private String text;

    public TextField(String text) {
        this.text = text;
    }

    @Override
    public void render() {
        System.out.println("Rendering TextField with text: " + text);
    }
}
