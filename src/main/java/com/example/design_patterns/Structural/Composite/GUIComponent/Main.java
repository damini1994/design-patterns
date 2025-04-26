package com.example.design_patterns.Structural.Composite.GUIComponent;

public class Main {
    public static void main(String[] args) {
        // Create leaf components
        Button button1 = new Button("Submit");
        TextField textField1 = new TextField("Enter your name");
        Checkbox checkbox1 = new Checkbox(true);

        // Create a panel and add components to it
        Panel panel1 = new Panel("User Input Panel");
        panel1.addComponent(textField1);
        panel1.addComponent(button1);
        panel1.addComponent(checkbox1);

        // Create another panel
        Button button2 = new Button("Cancel");
        Panel panel2 = new Panel("Action Panel");
        panel2.addComponent(button2);

        // Create a window and add panels to it
        Window window = new Window("Main Window");
        window.addComponent(panel1);
        window.addComponent(panel2);

        // Render the entire GUI structure
        window.render();
    }
}
//OUTPUT

//Rendering Window: Main Window
//Rendering Panel: User Input Panel
//Rendering TextField with text: Enter your name
//Rendering Button: Submit
//Rendering Checkbox: Checked
//Rendering Panel: Action Panel
//Rendering Button: Cancel
