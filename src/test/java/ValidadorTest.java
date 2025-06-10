import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidadorTest {

    Validador validador = new Validador();

    @Test
    void testFormatoValido() {
        assertTrue(validador.formatoValido("12345678Z"));
        assertFalse(validador.formatoValido("1234A678Z"));
        assertFalse(validador.formatoValido("12345678"));
    }

    @Test
    void testLetraCorrecta() {
        assertTrue(validador.letraCorrecta("12345678Z")); // Z es la correcta para 12345678
        assertFalse(validador.letraCorrecta("12345678A")); // A no lo es
    }
}