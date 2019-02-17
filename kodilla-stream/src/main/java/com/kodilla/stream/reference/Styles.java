package com.kodilla.stream.reference;

public class Styles {
    public static String addABCToTheString(String text) {
        return "ABC" + text + "ABC";
    }


    public static String convertTheStringToCapitalLetters(String text) {
        return text.toUpperCase();
    }


    public static String[] splitTheString(String text) {
        return text.split("\\.");
    }


    public static String convertTheStringToChar(String text) {
        char c = text.charAt(6);
        return text + " - the sixth letter of the text is: " + c;
    }

    public static String checkTextLength(String text) {
        return "The length of the text: " + text + " is: " + text.length();
    }

    public static String convertTheStringToLowerCaseLetters(String text) {
        return text.toLowerCase();
    }


}
