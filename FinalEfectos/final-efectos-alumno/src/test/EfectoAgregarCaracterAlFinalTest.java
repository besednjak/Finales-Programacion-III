package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import source.EfectoAgregarCaracterAlFinal;
import source.NoSePuedeAplicarEfectoATextoVacio;

public class EfectoAgregarCaracterAlFinalTest {

    @Test
    public void noSePuedeAplicarEfectoAUnTextoVacio() {
        String textoVacio = "";
        Character caracterParaAgregar = 'X';
        EfectoAgregarCaracterAlFinal unEfecto = new EfectoAgregarCaracterAlFinal(caracterParaAgregar);

        Assertions.assertThrows(NoSePuedeAplicarEfectoATextoVacio.class, () -> unEfecto.aplicarEfecto(textoVacio));
    }

    @Test
    public void debeaAgregarElCaracterEspecificado() throws NoSePuedeAplicarEfectoATextoVacio {
        String textoNormal = "Hola";
        String textoEsperado = "Hola!";
        Character caracterParaAgregar = '!';

        EfectoAgregarCaracterAlFinal unEfecto = new EfectoAgregarCaracterAlFinal(caracterParaAgregar);

        Assertions.assertEquals(unEfecto.aplicarEfecto(textoNormal), textoEsperado);
    }

    @Test
    public void siNoSeIngresaCaracterAgregaTextoVacioPorDefecto() throws NoSePuedeAplicarEfectoATextoVacio {
        String textoNormal = "Hola";

        EfectoAgregarCaracterAlFinal unEfecto = new EfectoAgregarCaracterAlFinal();

        Assertions.assertEquals(unEfecto.aplicarEfecto(textoNormal), textoNormal);
    }
}
