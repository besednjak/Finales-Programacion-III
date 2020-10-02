package obj;

public class LosaRadiante implements ComponenteElectrico {

    private static final Integer PRECIO_KW = 10;
    private Integer metrosCuadradosDeLosa;

    public LosaRadiante(Integer metrosCuadrados) {
        metrosCuadradosDeLosa = metrosCuadrados;
    }

    @Override
    public Integer calcularConsumo() {
        return metrosCuadradosDeLosa * PRECIO_KW;
    }
}
