import java.util.Comparator;

public class comparadorPorNombre implements Comparator<Elemento> {

    @Override
    public int compare(Elemento e1, Elemento e2) {
        return e1.getTitulo().compareTo(e2.getTitulo());
    }

}
