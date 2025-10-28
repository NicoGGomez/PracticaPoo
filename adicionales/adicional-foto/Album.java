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

public class Album extends Elemento {

    // atributos
    protected ArrayList<Elemento> elementos;

    // constructor
    public Album(String t){
        super(t);
        elementos = new ArrayList<>();
    }

    // metodos de clase
    public void addElem(Elemento e){
        elementos.add(e);
    }

    // metodos abstraidos 
    @Override
    int cantidadElem() {
        int total = 0;
        for(Elemento e : elementos){
            total += e.cantidadElem();
        }
        return total;
    }

    @Override
    double pesoTotal() {
        double total = 0;
        for(Elemento e : elementos){
            total += e.pesoTotal();
        }
        return total;
    }

    @Override
    ArrayList<String> personas() {
        ArrayList<String> retorno = new ArrayList<>();
        for (Elemento e : elementos) {
            for(String p : e.personas()){
                if(!retorno.contains(p)){
                    retorno.add(p);
                }
            }
        }
        return retorno;
    }

    @Override
    Elemento copia(Condicion c) {
        Album copia = new Album(getTitulo());
        boolean seAgrego = false;
        for(Elemento e : elementos){
            copia.addElem(e);
        }
        for (Elemento e : elementos) {
            Elemento foto = e.copia(c);
            if(foto != null){
                copia.addElem(foto);
                seAgrego = true;
            }
        }
        if (!seAgrego) {
            return null;
        }
        return copia;
    }

}
