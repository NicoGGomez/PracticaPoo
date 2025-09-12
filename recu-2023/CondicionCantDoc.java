public class CondicionCantDoc extends Condicion {
    private int cantDocentesMax; // 2

    public CondicionCantDoc(int c){
        this.cantDocentesMax = c;
    }
    
    @Override
    public boolean cumple(Curso c) {
        return cantDocentesMax > c.getCantDoc();
    }
}
