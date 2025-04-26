package com.example.design_patterns.Structural.Composite.FileSystem;

public class File implements FileSystem {

    String filename;

    public File(String filename) {
        this.filename = filename;
    }

    @Override
    public void ls() {
        System.out.println("Filename is: "+filename);
    }
}
