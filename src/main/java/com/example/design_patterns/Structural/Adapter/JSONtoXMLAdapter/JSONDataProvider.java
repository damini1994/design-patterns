package com.example.design_patterns.Structural.Adapter.JSONtoXMLAdapter;

//Adaptee
public class JSONDataProvider {
    public String getJSONData() {
        return "{ \"name\": \"John Doe\", \"age\": 30, \"city\": \"New York\" }";
    }
}
