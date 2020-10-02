package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import source.EfectoMinusculaAPrimeraLetra;
import source.NoSePuedeAplicarEfectoATextoVacio;

public class EfectoMinusculaAPrimeraLetraTest {
    @Test
    public void noSePuedeAplicarEfectoAUnTextoVacio() {
        String textoVacio = "";
        EfectoMinusculaAPrimeraLetra unEfecto = new EfectoMinusculaAPrimeraLetra();

        Assertions.assertThrows(NoSePuedeAplicarEfectoATextoVacio.class, () -> unEfecto.aplicarEfecto(textoVacio));
    }

    @Test
    public void debePonerLaPrimeraLetraEnMinuscula() throws NoSePuedeAplicarEfectoATextoVacio {
        String textoNormal = "Hola!";
        String textoEsperado = "hola!";

        EfectoMinusculaAPrimeraLetra unEfecto = new EfectoMinusculaAPrimeraLetra();

        Assertions.assertEquals(unEfecto.aplicarEfecto(textoNormal), textoEsperado);
    }
}
