//  a = abstracta
//  c = concreta
//  h = hereda

// (a) Elem implements comparable<Elem> (fecha, peso) str titulo, date fecha
// metodos: int cantidadElem(), double pesoTotal(), Arr<str> personas(), Elem copia(Cond c) ☑️

// (c) Fotografia str titulo (h), int id, double peso, date fcaptura (h), arr<str> pers ☑️

// (c) Album str titulo (h), date fCreacion (h), arr<Elem> elementos

// (c) AlbumRestringido int cantMaxFotos

// SI EL ALBUM QUEDA VACIO, RETURN NULL (ya q no se retorna)

import java.util.ArrayList;

public class Fotografia extends Elemento {

    // atributos
    private int id;
    private double peso;
    protected ArrayList<String> personas;

    // constructor
    public Fotografia(String t, int i, double p){
        super(t);
        id = i;
        peso = p;
        personas = new ArrayList<>();
    }

    // metodos de clase 
    public void agregarPersonas(String p){
        personas.add(p);
    }

    // get y set
    public int getId() {
        return id;
    }

    public double getPeso() {
        return peso;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // metodos abstraidos 
    @Override
    int cantidadElem() {
        return 1;
    }

    @Override
    double pesoTotal() {
        return peso;
    }
    
    @Override
    ArrayList<String> personas() {
        ArrayList<String> retorno = new ArrayList<>();
        for(String p: personas){
            retorno.add(p);
        }
        return retorno;
    }

    @Override
    Elemento copia(Condicion c) {
        if (c.cumple(this)) {
            Fotografia copia = new Fotografia(getTitulo(), id, peso);
            for (String p : personas) {
                copia.agregarPersonas(p);
            }
            return copia;
        }        
        return null;
    }
    
}