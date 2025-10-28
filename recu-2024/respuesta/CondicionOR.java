package respuesta2;

public class CondicionOR extends Condicion {
    Condicion c1;
    Condicion c2;
    public CondicionOR(Condicion c1, Condicion c2){
        this.c1 = c1;
        this.c2 = c2;
    }
    @Override
    boolean cumple(Pitufo p) {
        return c1.cumple(p) || c2.cumple(p);
    }
}
