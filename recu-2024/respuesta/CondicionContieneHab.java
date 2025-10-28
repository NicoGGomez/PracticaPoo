package respuesta2;

public class CondicionContieneHab extends Condicion {
    private String habilidad;
    public CondicionContieneHab(String h){
        habilidad = h;
    }
    @Override
    boolean cumple(Pitufo p) {
        return p.getHabilidades().contains(habilidad);
    }
}
