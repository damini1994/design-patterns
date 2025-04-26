package com.example.design_patterns.Structural.Adapter.JSONtoXMLAdapter;

import org.json.JSONObject;
import org.json.XML;

//Adapter
public class JSONToXMLAdapter implements XMLDataProcessor{
    private JSONDataProvider jsonDataProvider;

    public JSONToXMLAdapter(JSONDataProvider jsonDataProvider) {
        this.jsonDataProvider = jsonDataProvider;
    }

    @Override
    public String processXMLData(String xmlData) {
        // Get JSON data from Adaptee
        String jsonData = jsonDataProvider.getJSONData();

        // Convert JSON to XML
        JSONObject jsonObject = new JSONObject(jsonData);
        String convertedXML = XML.toString(jsonObject);

        return convertedXML;
    }
}
