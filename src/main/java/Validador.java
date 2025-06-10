public class Validador {
    private static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";

    /**
     Comprueba si el DNI tiene un formato válido (8 dígitos + letra).
     * @param dni DNI completo como cadena
     * @return true si el formato es correcto, false si no lo es
     */
    public boolean formatoValido(String dni) {
        return dni != null && dni.matches("\\d{8}[A-Z]");
    }

    /**
     Comprueba si la letra del DNI es la correcta según el número.
     @param dni DNI completo como cadena
     @return true si la letra es correcta, false si no lo es o si el formato es inválido
     */
    public boolean letraCorrecta(String dni) {
        if (!formatoValido(dni)) return false;
        int numero = Integer.parseInt(dni.substring(0, 8));
        char letraEsperada = LETRAS.charAt(numero % 23);
        return dni.charAt(8) == letraEsperada;
    }
}

