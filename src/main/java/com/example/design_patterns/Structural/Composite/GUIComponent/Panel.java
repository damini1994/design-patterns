package com.example.design_patterns.Structural.Composite.GUIComponent;

import java.util.ArrayList;
import java.util.List;

public class Panel implements GUIComponent {
    private String name;
    private List<GUIComponent> children = new ArrayList<>();

    public Panel(String name) {
        this.name = name;
    }

    public void addComponent(GUIComponent component) {
        children.add(component);
    }

    public void removeComponent(GUIComponent component) {
        children.remove(component);
    }

    @Override
    public void render() {
        System.out.println("Rendering Panel: " + name);
        for (GUIComponent component : children) {
            component.render();
        }
    }
}
