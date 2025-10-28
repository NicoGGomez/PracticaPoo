package respuesta2;

import java.util.ArrayList;

public class Pitufo extends PitufiElem implements Comparable<Pitufo> {
    private String nombre;
    private int anoExp;
    private int velTrab;
    private int creatividad;
    protected ArrayList<String> habilidades;

    public Pitufo(String n, int a, int v, int c){
        nombre = n;
        anoExp = a;
        velTrab = v;
        c = creatividad;
        habilidades = new ArrayList<>();
    }

    @Override
    public int compareTo(Pitufo otrPitufo) {
        int res = this.getAnoExp() - otrPitufo.getAnoExp();
        if (res == 0) {
            res = this.getAnoExp() - otrPitufo.getAnoExp();
            if (res == 0) {
                return this.getNombre().compareTo(otrPitufo.getNombre());
            }
        }
        return res;
    }

    public ArrayList<String> getHabilidades() {
        ArrayList<String> retorno = new ArrayList<>();
        for (String h : habilidades) {
            retorno.add(h);
        }
        return retorno;
    }

    public void addHabilidad(String h){
        habilidades.add(h);
    }

    public int getAnoExp() {
        return anoExp;
    }

    public int getCreatividad() {
        return creatividad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVelTrab() {
        return velTrab;
    }

    @Override
    PitufiElem copia() {
        Pitufo copia = new Pitufo(nombre, anoExp, velTrab, creatividad);
        for (String h : habilidades) {
            copia.addHabilidad(h);
        }
        return copia;
    }

    @Override
    int cantidadPitufos(Condicion c) {
        if (c.cumple(this)) {
            return 1;
        }
        return 0;
    }

}