package obj;

import java.util.ArrayList;

public class Casa {

    private ArrayList<ComponenteElectrico> componentesElectricos;

    public Casa(){
        componentesElectricos = new ArrayList<>();
    }

    public void agregarComponenteElectrico(ComponenteElectrico unComponente) {
        componentesElectricos.add(unComponente);
    }

    public int getGastoTotal() {

        int gasto = componentesElectricos.stream().mapToInt(ComponenteElectrico::calcularConsumo).sum();

        return gasto;
    }

}

