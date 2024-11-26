package com.example.design_patterns.Behavioural.Template.FileParsing;

public abstract class FileParser {

    // Template method
    public final void parseFile(String fileName) {
        openFile(fileName);
        parseData();
        closeFile();
    }

    private void openFile(String fileName) {
        System.out.println("Opening file: " + fileName);
    }

    private void closeFile() {
        System.out.println("Closing file");
    }

    protected abstract void parseData();
}
