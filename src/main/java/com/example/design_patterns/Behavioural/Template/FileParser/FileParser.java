package com.example.design_patterns.Behavioural.Template.FileParser;

public abstract class FileParser {

    public final void parseFile(String filename) {
        openFile(filename);
        parseData();
        closeFile();
    }

    private void closeFile() {
        System.out.println("Closing file");
    }

    protected abstract void parseData();

    private void openFile(String filename) {
        System.out.println("Opening file: "+filename);
    }
}
