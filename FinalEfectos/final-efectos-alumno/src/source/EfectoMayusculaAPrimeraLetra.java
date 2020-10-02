package source;

public class EfectoMayusculaAPrimeraLetra implements AplicadorDeEfectos{

    private static final String TEXTO_VACIO = "";

    private String ponerMayuscula(String textoParaModificar) {
        return textoParaModificar.substring(0,1).toUpperCase() + textoParaModificar.substring(1);
    }

    @Override
    public String aplicarEfecto(String textoParaModificar) throws NoSePuedeAplicarEfectoATextoVacio {
        if(textoParaModificar.equals(TEXTO_VACIO)) {
            throw new NoSePuedeAplicarEfectoATextoVacio();
        }
        return ponerMayuscula(textoParaModificar);
    }

}
