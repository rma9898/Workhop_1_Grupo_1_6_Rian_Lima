package br.workshop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void deveValidarEmailCorreto() {
        assertTrue(ValidadorEmail.ehValido("teste@dominio.com"));
    }

    @Test
    void deveInvalidarEmailSemAt() {
        assertFalse(ValidadorEmail.ehValido("testedominio.com"));
    }
}
