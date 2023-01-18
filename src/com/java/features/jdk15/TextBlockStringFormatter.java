package com.java.features.jdk15;

public class TextBlockStringFormatter {

    public static void main(String[] args) {
        String simpleJSONMessage = """
		{
		        "firstName": "%s",
		        "lastName": "%s",
		        "jobTitle": "%s",
		        "twitterHandle": "%s"
		}
		""";

        System.out.println(simpleJSONMessage.
                formatted("Mayur",
                        "Chakalasiya",
                        "Java Developer",
                        "@MayurChakalasiya"));
    }
}
