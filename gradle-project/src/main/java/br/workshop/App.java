package br.workshop;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        String email = "utilizador@teste.com";
        boolean valido = ValidadorEmail.ehValido(email);

        Map<String, Object> resultado = new HashMap<>();
        resultado.put("email", email);
        resultado.put("valido", valido);

        Gson gson = new Gson();
        System.out.println(gson.toJson(resultado));
    }
}
