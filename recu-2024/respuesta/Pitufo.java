import java.util.ArrayList;

public class Pitufo extends ElemPitufo {
    private String nombre;
    private double vel;
    private double exp;
    private double crea;
    protected ArrayList<String> habs;

    public Pitufo(String n, double v, double e, double c){
        this.nombre = n;
        this.vel = v;
        this.exp = e;
        this.crea = c;
        this.habs = new ArrayList<>();
    }

    // funciones abstraidas

    @Override
    int getCantPitufos(Condicion c) {
        if (c.cumple(this)) {
            return 1;
        }
        return 0;
    }

    @Override
    double getCrea() {
        return crea;
    }

    @Override
    double getVel() {
        return vel;
    }

    @Override
    ArrayList<String> getHabs() {
        ArrayList<String> retorno = new ArrayList<>();
        for(String h: habs){
            retorno.add(h);
        }
        return retorno;
    }

    @Override
    ElemPitufo getCopia() {
        Pitufo copia = cascaron();
        for(String h: habs){
            copia.habs.add(h);
        }
        return copia;
    }

    // get, set y funciones de clase

    Pitufo cascaron(){
        return new Pitufo(nombre, vel, exp, crea);
    } 

    public void agregarHabilidad(String hab){
        if(!this.habs.contains(hab)){
            this.habs.add(hab);
        }
    }

    public double getExp() {
        return exp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCrea(double crea) {
        this.crea = crea;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
