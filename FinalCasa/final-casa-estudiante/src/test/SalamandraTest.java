package test;

import obj.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalamandraTest {
    @Test
    public void seCreaSalamandraCon15KilosDePinoSeCalculaCosto() throws NoSePuedenAgregarMasDe15KilosDeMaderaALaEstufa {
        Madera pino = new Pino();
        Integer kilosDePino = 15;
        Integer metrosCuadrados = 10;
        Integer costoEsperado = 100;
        Salamandra estufa = new Salamandra(metrosCuadrados);
        estufa.agregarMadera(pino, kilosDePino);

        Assertions.assertEquals(costoEsperado, estufa.calcularConsumo());
    }

    @Test
    public void seCreaSalamandraCon15KilosDeQuebrachoSeCalculaCosto() throws NoSePuedenAgregarMasDe15KilosDeMaderaALaEstufa {
        Quebracho quebracho = new Quebracho();
        Integer kilosDeQuebracho = 15;
        Integer metrosCuadrados = 10;
        Integer costoEsperado = 1200;
        Salamandra estufa = new Salamandra(metrosCuadrados);
        estufa.agregarMadera(quebracho, kilosDeQuebracho);

        Assertions.assertEquals(costoEsperado, estufa.calcularConsumo());
    }

    @Test
    public void noSePuedenAgregarMasDe15KilosALaSalamandra()  {
        Madera pino = new Pino();
        Integer kilosDePino = 16;
        Integer metrosCuadrados = 10;
        Salamandra estufa = new Salamandra(metrosCuadrados);

        Assertions.assertThrows(NoSePuedenAgregarMasDe15KilosDeMaderaALaEstufa.class, () -> estufa.agregarMadera(pino, kilosDePino));
    }

}
