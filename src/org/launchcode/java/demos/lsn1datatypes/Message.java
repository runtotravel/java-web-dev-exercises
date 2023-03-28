package org.launchcode.java.demos.lsn1datatypes;

public class Message {

    public static String getMessage(String lang) {

        if (lang.equals("sp")) {
            return "¡Hola, Mundo!";
        } else if (lang.equals("fr")) {
            return "Bonjour, Frenchies!";
        } else if (lang.equals("ger")) {
            return "Hallo, Deutchland!";
        } else {
            return "Hello, World!";
        }
    }
}
