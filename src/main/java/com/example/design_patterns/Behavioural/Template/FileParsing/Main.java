package com.example.design_patterns.Behavioural.Template.FileParsing;

public class Main {
    public static void main(String[] args) {
        FileParser csvParser = new CSVParser();
        csvParser.parseFile("data.csv");

        System.out.println();

        FileParser xmlParser = new XMLParser();
        xmlParser.parseFile("data.xml");
    }
}

//Output
//
//Opening file: data.csv
//Parsing CSV data
//Closing file
//
//Opening file: data.xml
//Parsing XML data
//Closing file
