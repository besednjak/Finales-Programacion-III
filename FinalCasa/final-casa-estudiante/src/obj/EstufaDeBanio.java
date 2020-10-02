package obj;

public class EstufaDeBanio implements ComponenteElectrico{

    private static final Integer PRECIO_KW = 10;
    private static final Integer CALORIAS = 1000;
    private Integer ambientesConEstufa;

    public EstufaDeBanio(Integer ambientes) {
        ambientesConEstufa = ambientes;
    }

    @Override
    public Integer calcularConsumo() {
        return ambientesConEstufa * PRECIO_KW * CALORIAS;
    }
}
