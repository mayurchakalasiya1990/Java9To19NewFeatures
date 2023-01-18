package com.java.features.jdk11;

/*


isBlank(): eturns true if a String contains on whitespace as defined within java.lang.Character.isWhitespace(int codePoint)
stripLeading() : Returns a String with all leading whitespace characters removed.
stripTrailing() : Returns a String with all trailing whitespace characters removed.
strip() : Returns a String with all leading and trailing whitespace characters removed.
 */

public class StringMethods {

    public static void main(String[] args) {
        String empty="";
        String blank="  ";
        System.out.println("empty.isBlank():"+empty.isBlank());
        System.out.println("empty.isEmpty():"+empty.isEmpty());
        System.out.println("blank.isBlank():"+blank.isBlank());
        System.out.println("blank.isEmpty():"+blank.isEmpty());

        String example = " Mayur Chakalasiya ";
        System.out.println("Remove leading space:"+example.stripLeading());
        System.out.println("Remove trailing space:"+example.stripLeading());
        System.out.println("Remove leading and trailing space:");
    }
}
