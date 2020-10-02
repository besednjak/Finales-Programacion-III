package obj;

public class Quebracho implements Madera{

    private static final Integer PRECIO_KILO = 4;
    private static final Integer PUREZA = 2;
    private int kilosDeMadera;

    @Override
    public int calcularCostoPara(int metrosCuadrados) {
        return (metrosCuadrados * kilosDeMadera * PRECIO_KILO * PUREZA);
    }

    @Override
    public void agregarKilos(int kilos) {
        kilosDeMadera = kilos;
    }
}
