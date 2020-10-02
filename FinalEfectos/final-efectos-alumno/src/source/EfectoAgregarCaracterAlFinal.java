package source;

public class EfectoAgregarCaracterAlFinal implements AplicadorDeEfectos {

    private static final String TEXTO_VACIO = "";
    private String paraAgregar;

    private String agregarCaracterAlFinal(String textoParaModificar) {
        return textoParaModificar + paraAgregar;
    }

    public void cambiarCaracterParaAgregar(Character caracterParaAgregar){
        paraAgregar = caracterParaAgregar.toString();
    }

    public EfectoAgregarCaracterAlFinal(){
        paraAgregar = TEXTO_VACIO;
    }

    public EfectoAgregarCaracterAlFinal(Character caracterParaAgregar) {
        cambiarCaracterParaAgregar(caracterParaAgregar);
    }

    @Override
    public String aplicarEfecto(String textoParaModificar) throws NoSePuedeAplicarEfectoATextoVacio {
        if(textoParaModificar.equals(TEXTO_VACIO)) {
            throw new NoSePuedeAplicarEfectoATextoVacio();
        }
        return agregarCaracterAlFinal(textoParaModificar);
    }

}
