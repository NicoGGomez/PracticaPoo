public class CondicionAnd extends Condicion {
    Condicion c1;
    Condicion c2;
    
    public CondicionAnd(Condicion c1, Condicion c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Curso c) {
        return c1.cumple(c) && c2.cumple(c);
    }
}
