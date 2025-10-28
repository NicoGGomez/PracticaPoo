package respuesta2;

public class CondicionPorAno extends Condicion {
    private int anosDeExp;
    public CondicionPorAno(int a){
        anosDeExp = a;
    }
    @Override
    boolean cumple(Pitufo p) {
        return p.getAnoExp() > anosDeExp;
    }
}
