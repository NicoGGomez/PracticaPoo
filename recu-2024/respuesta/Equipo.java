package respuesta2;

import java.util.ArrayList;

public abstract class Equipo extends PitufiElem {
    protected ArrayList<PitufiElem> pitufos;

    public Equipo(){
        pitufos = new ArrayList<>();
    }

    public void addPitufo(PitufiElem p){
        pitufos.add(p);
    }

    @Override
    ArrayList<String> getHabilidades() {
        ArrayList<String> retorno = new ArrayList<>();
        for(PitufiElem p : pitufos){
            ArrayList<String> aux =  p.getHabilidades();
            for(String h : aux){
                if (!retorno.contains(h)) {
                    retorno.add(h);
                }
            }
        }
        return retorno;
    }

    @Override
    int cantidadPitufos(Condicion c) {
        int total = 0;
        for(PitufiElem p: pitufos){
            total += p.cantidadPitufos(c);
        }
        return total;
    }

    @Override
    PitufiElem copia() {
        Equipo copia = getCascaron();
        for(PitufiElem p: pitufos){
            copia.addPitufo(p.copia());
        }
        return copia;
    }

    abstract Equipo getCascaron();
    
}
