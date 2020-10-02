package obj;

public class CercoElectrico implements ComponenteElectrico {

    private static final Integer PRECIO_KW = 10;
    private Integer metrosDeCerco;

    public CercoElectrico(Integer metros) {
        metrosDeCerco = metros;
    }

    @Override
    public Integer calcularConsumo() {
        return metrosDeCerco * PRECIO_KW;
    }
}
