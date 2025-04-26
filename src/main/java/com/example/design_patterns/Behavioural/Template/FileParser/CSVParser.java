package com.example.design_patterns.Behavioural.Template.FileParser;

public class CSVParser extends FileParser {

    @Override
    protected void parseData() {
        System.out.println("Parsing CSV data");
    }
}
