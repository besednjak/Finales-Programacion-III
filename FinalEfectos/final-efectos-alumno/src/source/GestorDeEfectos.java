package source;

import java.awt.*;
import java.util.ArrayList;

public class GestorDeEfectos {

    private static final String TEXTO_VACIO = "";

    private ArrayList<AplicadorDeEfectos> efectos;
    private String textoActual;

    public GestorDeEfectos(){
        efectos = new ArrayList<>();
    }

    public void agregarEfecto(AplicadorDeEfectos unEfecto) {
        efectos.add(unEfecto);
    }

    public void aplicarEfectoActual(AplicadorDeEfectos efectoActual) throws NoSePuedeAplicarEfectoATextoVacio {
       textoActual = efectoActual.aplicarEfecto(textoActual);
    }

    public String aplicarEfectos(String textoNormal) throws NoSePuedeAplicarEfectoATextoVacio {
        if(textoNormal.equals(TEXTO_VACIO)){
            throw new NoSePuedeAplicarEfectoATextoVacio();
        }
        textoActual = textoNormal;
        efectos.forEach(efecto -> {
            try {
                aplicarEfectoActual(efecto);
            } catch (NoSePuedeAplicarEfectoATextoVacio noSePuedeAplicarEfectoATextoVacio) {
                noSePuedeAplicarEfectoATextoVacio.printStackTrace();
            }
        });

        return textoActual;
    }
}
