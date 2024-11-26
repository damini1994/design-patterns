package com.example.design_patterns.Structural.Composite.GUIComponent;

import java.util.ArrayList;
import java.util.List;

public class Panel implements GUIComponent {
    private List<GUIComponent> components = new ArrayList<>();

    public void addComponent(GUIComponent component) {
        components.add(component);
    }

    public void removeComponent(GUIComponent component) {
        components.remove(component);
    }

    @Override
    public void render() {
        System.out.println("Rendering a panel with components:");
        for (GUIComponent component : components) {
            component.render();
        }
    }
}
