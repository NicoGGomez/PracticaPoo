package respuesta2;

import java.util.ArrayList;

public class PitufoEgo extends Pitufo {
    private int valorExtraPorEgo;

    public PitufoEgo(String n, int a, int v, int c, int valor){
        super(n, a, v, c);
        valorExtraPorEgo = valor;
    }

    @Override
    public ArrayList<String> getHabilidades() {
        ArrayList<String> retorno = new ArrayList<>();
        retorno.add(habilidades.get(0));
        return retorno;
    }

    @Override
    public int getCreatividad() {
        return super.getCreatividad() * valorExtraPorEgo;
    }

    @Override
    public int getVelTrab() {
        return super.getVelTrab() * valorExtraPorEgo;
    }

    @Override
    public int getAnoExp() {
        return super.getAnoExp() * valorExtraPorEgo;
    }

    public int getValorExtraPorEgo() {
        return valorExtraPorEgo;
    }

    public void setValorExtraPorEgo(int valorExtraPorEgo) {
        this.valorExtraPorEgo = valorExtraPorEgo;
    }
}
