package obj;

public class Pino implements Madera {

    private static final Integer PRECIO_KILO = 2;
    private static final Integer COEFICIENTE_CALORICO = 3;
    private int kilosDeMadera;


    @Override
    public int calcularCostoPara(int metrosCuadrados) {
        return ((metrosCuadrados * kilosDeMadera * PRECIO_KILO) / COEFICIENTE_CALORICO);
    }


    @Override
    public void agregarKilos(int kilos) {
        kilosDeMadera = kilos;
    }
}
