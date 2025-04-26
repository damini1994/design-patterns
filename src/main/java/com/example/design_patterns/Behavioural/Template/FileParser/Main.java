package com.example.design_patterns.Behavioural.Template.FileParser;

public class Main {
    public static void main(String[] args) {
        FileParser fileParser = new CSVParser();
        fileParser.parseFile("data.csv");

        System.out.println("***************************************");

        FileParser fileParser1 = new XMLParser();
        fileParser1.parseFile("data.xml");
    }
}

//output

//Opening file: data.csv
//Parsing CSV data
//Closing file
//***************************************
//Opening file: data.xml
//Parsing XML data
//Closing file