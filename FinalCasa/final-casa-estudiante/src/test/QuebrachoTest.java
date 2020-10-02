package test;

import obj.Pino;
import obj.Quebracho;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuebrachoTest {

    @Test
    public void seCalculaCostoDeConsumoParaQuebrachoTest(){
        Quebracho quebracho = new Quebracho();
        Integer kilosDeQuebracho = 15;
        Integer metrosCuadrados = 10;
        Integer costoEsperado = 1200;
        quebracho.agregarKilos(kilosDeQuebracho);

        Assertions.assertEquals(costoEsperado, quebracho.calcularCostoPara(metrosCuadrados));
    }
}
