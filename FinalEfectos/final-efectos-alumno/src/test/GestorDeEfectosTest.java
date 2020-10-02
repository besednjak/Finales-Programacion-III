package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import source.*;

public class GestorDeEfectosTest {
    @Test
    public void noSePuedeAplicarEfectoAUnTextoVacio() {

       // Assertions.assertThrows(NoSePuedeAplicarEfectoATextoVacio.class, () -> unEfecto.aplicarEfecto(textoVacio));
    }

    //Efectos Propuestos Por Para El Final
    @Test
    public void seDebeAgregarUn3AlFinalYLaPrimeraLetraEnMinuscula() throws NoSePuedeAplicarEfectoATextoVacio {

        String textoNormal = "HOLA!";
        String textoEsperado = "hOLA!3";
        Character caracterParaAgregar = '3';
        EfectoMinusculaAPrimeraLetra unEfecto = new EfectoMinusculaAPrimeraLetra();
        EfectoAgregarCaracterAlFinal otroEfecto = new EfectoAgregarCaracterAlFinal(caracterParaAgregar);
        GestorDeEfectos miGestor = new GestorDeEfectos();

        miGestor.agregarEfecto(unEfecto);
        miGestor.agregarEfecto(otroEfecto);

        Assertions.assertEquals(textoEsperado, miGestor.aplicarEfectos(textoNormal));

    }

    @Test
    public void seDebeVoltearLaCadenaPonerLaPrimeraLetraEnMinusculaYUn4AlFinal() throws NoSePuedeAplicarEfectoATextoVacio {

        String textoNormal = "HOLA";
        String textoEsperado = "aLOH4";
        Character caracterParaAgregar = '4';
        EfectoMinusculaAPrimeraLetra unEfecto = new EfectoMinusculaAPrimeraLetra();
        EfectoAgregarCaracterAlFinal otroEfecto = new EfectoAgregarCaracterAlFinal(caracterParaAgregar);
        EfectoDarVuelta unEfectoMas = new EfectoDarVuelta();
        GestorDeEfectos miGestor = new GestorDeEfectos();

        miGestor.agregarEfecto(unEfectoMas);
        miGestor.agregarEfecto(unEfecto);
        miGestor.agregarEfecto(otroEfecto);

        Assertions.assertEquals(textoEsperado, miGestor.aplicarEfectos(textoNormal));

    }


}
