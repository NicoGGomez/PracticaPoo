//  a = abstracta
//  c = concreta
//  h = hereda

// (a) Elem implements comparable<Elem> (fecha, peso) str titulo, date fecha
// metodos: int cantidadElem(), double pesoTotal(), Arr<str> personas(), Elem copia(Cond c) ☑️

// (c) Fotografia str titulo (h), int id, double peso, date fcaptura (h), arr<str> pers

// (c) Album str titulo (h), date fCreacion (h), arr<Elem> elementos

// (c) AlbumRestringido int cantMaxFotos

// SI EL ALBUM QUEDA VACIO, RETURN NULL (ya q no se retorna)

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Elemento implements Comparable<Elemento> {

    // atributos
    private String titulo;
    private LocalDate fecha;

    // constructor
    public Elemento(String t){
        titulo = t;
        fecha = LocalDate.now();
    }

    // metodos de clase
    @Override
    public int compareTo(Elemento o) {
        int total = this.getFecha().compareTo(o.getFecha());
        if (total == 0) {
            return Double.compare(this.pesoTotal(), o.pesoTotal());
        }
        return total;
    }

    // get y set
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // metodos abstractos  
    abstract int cantidadElem();
    abstract double pesoTotal();
    abstract ArrayList<String> personas();
    abstract Elemento copia(Condicion c);

}
