package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import source.EfectoMayusculaAPrimeraLetra;
import source.NoSePuedeAplicarEfectoATextoVacio;

public class EfectoMayusculaAPrimeraLetraTest {

    @Test
    public void noSePuedeAplicarEfectoAUnTextoVacio() {
        String textoVacio = "";
        EfectoMayusculaAPrimeraLetra unEfecto = new EfectoMayusculaAPrimeraLetra();

        Assertions.assertThrows(NoSePuedeAplicarEfectoATextoVacio.class, () -> unEfecto.aplicarEfecto(textoVacio));
    }

    @Test
    public void debePonerLaPrimeraLetraEnMayuscula() throws NoSePuedeAplicarEfectoATextoVacio {
        String textoNormal = "hola";
        String textoEsperado = "Hola";

        EfectoMayusculaAPrimeraLetra unEfecto = new EfectoMayusculaAPrimeraLetra();

        Assertions.assertEquals(unEfecto.aplicarEfecto(textoNormal), textoEsperado);
    }
}
