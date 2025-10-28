package respuesta2;

import java.util.ArrayList;
import java.util.Collections;

public class PapaPitufo {
    protected ArrayList<Pitufo> elementos;

    public ArrayList<Pitufo> listaOrdenada(){
        ArrayList<Pitufo> retorno = new ArrayList<>(elementos);
        Collections.sort(retorno);
        return retorno;
    }
}
