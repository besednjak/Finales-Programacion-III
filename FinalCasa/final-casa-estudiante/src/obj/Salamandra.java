package obj;

import java.util.ArrayList;

public class Salamandra implements ComponenteElectrico{

    private static final Integer MAXIMA_CAPACIDAD_KILOS = 15;
    private Integer metrosCuadradosParaCalefaccionar;
    private Integer kilosDeMadera;
    private ArrayList<Madera> maderas;


    public Salamandra(Integer metrosCuadrados) {
        kilosDeMadera = 0;
        maderas = new ArrayList<>();
        metrosCuadradosParaCalefaccionar = metrosCuadrados;
    }

    public void agregarMadera(Madera unaMadera, int kilos) throws NoSePuedenAgregarMasDe15KilosDeMaderaALaEstufa {
        if(kilosDeMadera+kilos > MAXIMA_CAPACIDAD_KILOS){
            throw new NoSePuedenAgregarMasDe15KilosDeMaderaALaEstufa();
        }
        kilosDeMadera += kilos;
        unaMadera.agregarKilos(kilos);
        maderas.add(unaMadera);
    }

    @Override
    public Integer calcularConsumo() {
        int gasto = maderas.stream().mapToInt(madera -> madera.calcularCostoPara(metrosCuadradosParaCalefaccionar)).sum();

        return gasto;
    }

}
