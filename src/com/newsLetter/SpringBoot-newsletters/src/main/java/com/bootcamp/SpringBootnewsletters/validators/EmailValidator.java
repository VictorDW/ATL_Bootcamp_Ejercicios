package com.bootcamp.SpringBootnewsletters.validators;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    public boolean isValido(String email) {

        int indiceArroba = email.indexOf('@');
        int indiceUltimoPunto = email.lastIndexOf('.');

        if (!email.contains("@")) {
            return false;
        }
        if (!email.contains(".")) {
            return false;
        }
        if (email.startsWith("@") || email.endsWith("@")) {
            return false;
        }
        if (email.contains(" ")) {
            return false;
        }
        if(email.contains(".@") ||email.contains("@.")){
            return false;
        }
        if(email.startsWith(".") ||email.endsWith(".")){
            return false;
        }

        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            if (!Character.isLetterOrDigit(c) && c != '@' && c != '.') {
                return false;
            }
        }

        if (indiceArroba < 6 ||  indiceArroba > 30) {
            return false;
        }

        if (((indiceUltimoPunto - indiceArroba) <= 2) || ((indiceUltimoPunto - indiceArroba) > 11))  {
            return false;
        }

        return true;
    }
}
