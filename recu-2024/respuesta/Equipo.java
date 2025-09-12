import java.util.ArrayList;

public abstract class Equipo extends ElemPitufo {
    protected ArrayList<ElemPitufo> miembros;

    public Equipo(){
        miembros = new ArrayList<>();
    }

    // funciones abstraidas

    @Override
    ArrayList<String> getHabs() {
        ArrayList<String> retorno = new ArrayList<>();
        for(ElemPitufo m: miembros){
            ArrayList<String> temp = new ArrayList<>();
            temp = m.getHabs();
            for (String h : temp) {
                if (!retorno.contains(h)) {
                    retorno.add(h);
                }
            }
        }
        return retorno;
    }

    @Override
    int getCantPitufos(Condicion c) {
        int cant = 0;
        for(ElemPitufo m: miembros){
            cant = m.getCantPitufos(c);
        }
        return cant;
    }

    @Override
    ElemPitufo getCopia() {
        Equipo copia = getCascaron();
        for (ElemPitufo m : miembros) {
            copia.agregarMiembro(m.getCopia());
        }
        return copia;
    }

    // funciones de clase

    protected abstract Equipo getCascaron();

    public void agregarMiembro(ElemPitufo m){
        miembros.add(m);
    }

    public ArrayList<ElemPitufo> getMiembros(){
        ArrayList<ElemPitufo> retorno = new ArrayList<>();
        for(ElemPitufo p: miembros){
            retorno.add(p);
        }
        return retorno;
    }

}
