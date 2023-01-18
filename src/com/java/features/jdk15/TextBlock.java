package com.java.features.jdk15;

import java.sql.SQLOutput;

public class TextBlock {
    public static void main(String[] args) {
        String simpleJSONMessage = "{\n" + //
                "\t\"firstName\": \"Billy\",\n" + //
                "\t\"lastName\": \"Korando\",\n" + //
                "\t\"jobTitle\": \"Java Developer Advocate\",\n" + //
                "\t\"twitterHandle\": \"@BillyKorando\"\n" + //
                "}";
        String employee = """
                {
                  "name": "John Smith",
                  "age": 35,
                  "isEmployed": true,
                  "address": {
                    "street": "123 Main St",
                    "city": "Anytown",
                    "state": "CA",
                    "zip": "12345"
                  },
                  "phoneNumbers": [
                    {
                      "type": "home",
                      "number": "555-555-5555"
                    },
                    {
                      "type": "work",
                      "number": "555-555-5556"
                    }
                  ],
                  "email": "john.smith@example.com"
                }
                                
                """;

        System.out.println("String: "+simpleJSONMessage);
        System.out.println("----------------------------------------------------");
        System.out.println("Text block:"+employee);
    }
}
