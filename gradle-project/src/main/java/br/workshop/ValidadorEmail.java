package br.workshop;

public class ValidadorEmail {
    public static boolean ehValido(String email) {
        if (email == null) return false;
        return email.contains("@") && email.contains(".");
    }
}
