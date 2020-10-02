package test;

import obj.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class CasaTest {

    @Test
    public void calculoDeGastosPara3ComponentesElectricostest() {
        Integer ambientesParaEstufa = 1;
        Integer metrosDeCerco = 10;
        Integer metrosCuadradosDeLosa = 100;
        Integer gastoEsperado = 11100;

        Casa casa =  new Casa();
        ComponenteElectrico estufaDelBanio = new EstufaDeBanio(ambientesParaEstufa);
        ComponenteElectrico losaComedor = new LosaRadiante(metrosCuadradosDeLosa);
        ComponenteElectrico cercoFondo = new CercoElectrico(metrosDeCerco);

        casa.agregarComponenteElectrico(estufaDelBanio);
        casa.agregarComponenteElectrico(losaComedor);
        casa.agregarComponenteElectrico(cercoFondo);

        Assertions.assertEquals(gastoEsperado, casa.getGastoTotal());
    }

}
