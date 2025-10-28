public class CondicionAnd extends Condicion {
    Condicion cond1;
    Condicion cond2;
    public CondicionAnd(Condicion c1, Condicion c2){
        cond1 = c1;
        cond2 = c2;
    }

    @Override
    boolean cumple(Elemento e) {
        return cond1.cumple(e) && cond2.cumple(e);
    }

}
