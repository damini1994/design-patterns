package com.example.design_patterns.Structural.Composite.GUIComponent;

public class Checkbox implements GUIComponent {
    private boolean checked;

    public Checkbox(boolean checked) {
        this.checked = checked;
    }

    @Override
    public void render() {
        System.out.println("Rendering Checkbox: " + (checked ? "Checked" : "Unchecked"));
    }
}
