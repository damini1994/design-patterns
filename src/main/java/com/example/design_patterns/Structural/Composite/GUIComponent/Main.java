package com.example.design_patterns.Structural.Composite.GUIComponent;

public class Main {
    public static void main(String[] args) {
        GUIComponent button = new Button();
        GUIComponent textField = new TextField();

        Panel panel = new Panel();
        panel.addComponent(button);
        panel.addComponent(textField);

        panel.render();
    }
}
//Output
//Rendering a panel with components:
//Rendering a button.
//Rendering a text field.