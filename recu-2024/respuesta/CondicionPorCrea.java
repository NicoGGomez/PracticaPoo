package respuesta2;

public class CondicionPorCrea extends Condicion {
    private int crea;
    public CondicionPorCrea(int c){
        crea = c;
    }
    @Override
    boolean cumple(Pitufo p) {
        return p.getCreatividad() == crea;
    }
}
