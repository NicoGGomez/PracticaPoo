import java.util.ArrayList;
import java.util.Collections;

public class sistema {
    Comparator<Elemento> ordenar;
    ArrayList<Elemento> elementos;

    public sistema(Comparator<Elemento> o){
        ordenar = o;
        elementos = new ArrayList<>();
    }

    public ArrayList<Elemento> ordenar(){
        Collections.sort(elementos, ordenar);
        return elementos;
    }
}
