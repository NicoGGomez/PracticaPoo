package respuesta2;

import java.util.ArrayList;

public class PitufoReb extends Pitufo {
    private int velmenos; // 500
    private int creaDivide; // 10
    public PitufoReb(String n, int a, int v, int c, int vel, int cre){
        super(n, a, v, c);
        velmenos = vel;
        creaDivide = cre;
    }

    @Override
    public ArrayList<String> getHabilidades() {
        ArrayList<String> retorno = new ArrayList<>();
        retorno.add(habilidades.get(0));
        return retorno;
    }

    @Override
    public int getCreatividad() {
        return super.getCreatividad() / creaDivide;
    }

    @Override
    public int getVelTrab() {
        return super.getVelTrab() - velmenos;
    }

    public int getVelmenos() {
        return velmenos;
    }

    public int getCreaDivide() {
        return creaDivide;
    }
}
