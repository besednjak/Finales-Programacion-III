package source;

public class EfectoDarVuelta implements AplicadorDeEfectos {

    private static final String TEXTO_VACIO = "";

    private String darVuelta(String textoNormal) {
        return new StringBuffer(textoNormal).reverse().toString();
    }

    @Override
    public String aplicarEfecto(String textoParaModificar) throws NoSePuedeAplicarEfectoATextoVacio {
        if(textoParaModificar.equals(TEXTO_VACIO)) {
            throw new NoSePuedeAplicarEfectoATextoVacio();
        }
        return darVuelta(textoParaModificar);
    }
}
