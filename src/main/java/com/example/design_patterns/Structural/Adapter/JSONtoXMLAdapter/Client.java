package com.example.design_patterns.Structural.Adapter.JSONtoXMLAdapter;

//Application expects data in XML format but receives JSON data from an external API.
// We'll use the Adapter pattern to convert JSON data into XML
public class Client {
    public static void main(String[] args) {
        JSONDataProvider jsonDataProvider = new JSONDataProvider();

        // Create an Adapter
        XMLDataProcessor adapter = new JSONToXMLAdapter(jsonDataProvider);

        // Client interacts with the Target interface
        String xmlData = adapter.processXMLData(null); // xmlData parameter is unused in this context
        System.out.println("Converted XML Data:\n" + xmlData);
    }
}
