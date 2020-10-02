package test;

import obj.Pino;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PinoTest {

    @Test
    public void seCalculaCostoDeConsumoParaPinoTest(){
        Pino pino = new Pino();
        Integer kilosDePino = 15;
        Integer metrosCuadrados = 10;
        Integer costoEsperado = 100;
        pino.agregarKilos(kilosDePino);

        Assertions.assertEquals(costoEsperado, pino.calcularCostoPara(metrosCuadrados));
    }
}
