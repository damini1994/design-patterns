package com.example.design_patterns.Behavioural.Template.FileParsing;

public class XMLParser extends FileParser {
    @Override
    protected void parseData() {
        System.out.println("Parsing XML data");
    }
}
