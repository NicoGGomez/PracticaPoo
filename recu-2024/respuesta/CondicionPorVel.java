package respuesta2;

public class CondicionPorVel extends Condicion {
    private int vel;
    public CondicionPorVel(int a){
        vel = a;
    }
    @Override
    boolean cumple(Pitufo p) {
        return p.getVelTrab() == vel;
    }
}
