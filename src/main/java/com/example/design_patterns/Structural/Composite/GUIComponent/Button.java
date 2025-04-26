package com.example.design_patterns.Structural.Composite.GUIComponent;

public class Button implements GUIComponent {
    private String label;

    public Button(String label) {
        this.label = label;
    }

    @Override
    public void render() {
        System.out.println("Rendering Button: " + label);
    }
}
