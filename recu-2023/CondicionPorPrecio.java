public class CondicionPorPrecio extends Condicion {
    private int precioMax; // 10000

    public CondicionPorPrecio(int p){
        this.precioMax=p;
    }

    @Override
    public boolean cumple(Curso c) {
        return precioMax >= c.getPrecio();
    }

}
