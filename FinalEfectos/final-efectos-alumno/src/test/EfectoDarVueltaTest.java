package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import source.EfectoDarVuelta;
import source.NoSePuedeAplicarEfectoATextoVacio;

public class EfectoDarVueltaTest {
    @Test
    public void noSePuedeAplicarEfectoAUnTextoVacio() {
        String textoVacio = "";

        EfectoDarVuelta unEfecto = new EfectoDarVuelta();

        Assertions.assertThrows(NoSePuedeAplicarEfectoATextoVacio.class, () -> unEfecto.aplicarEfecto(textoVacio));
    }

    @Test
    public void debeDarVueltaAlTextoIngresado() throws NoSePuedeAplicarEfectoATextoVacio {
        String textoNormal = "Hola!";
        String textoEsperado = "!aloH";

        EfectoDarVuelta unEfecto = new EfectoDarVuelta();

        Assertions.assertEquals(unEfecto.aplicarEfecto(textoNormal), textoEsperado);
    }
}
