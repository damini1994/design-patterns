package com.example.design_patterns.Structural.Composite.GUIComponent;

import java.util.ArrayList;
import java.util.List;

public class Window implements GUIComponent {
    private String title;
    private List<GUIComponent> children = new ArrayList<>();

    public Window(String title) {
        this.title = title;
    }

    public void addComponent(GUIComponent component) {
        children.add(component);
    }

    public void removeComponent(GUIComponent component) {
        children.remove(component);
    }

    @Override
    public void render() {
        System.out.println("Rendering Window: " + title);
        for (GUIComponent component : children) {
            component.render();
        }
    }
}
