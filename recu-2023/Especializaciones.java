import java.util.ArrayList;

public class Especializaciones extends elemento {
    protected ArrayList<Curso> cursos;

    public Especializaciones(String n){
        super(n);
        this.cursos = new ArrayList<>();
    }

    @Override
    public ArrayList<Curso> buscar(Condicion c) {
        ArrayList<Curso> retorno = new ArrayList<>();
        for(Curso cur: cursos){
            if (c.cumple(cur)) {
                retorno.add(cur);
            }
        }
        return retorno;
    }
    
    @Override
    public int getCantCursos() {
        return cursos.size();
    }

    @Override
    public Curso getCursoMasCaro() {
        Curso cursoMasCaro = new Curso("", 0); 
        for(Curso cur: cursos){
            Curso cursoTemp = cur;
            if (cursoTemp.getPrecio() > cursoMasCaro.getPrecio()) {
                cursoMasCaro = cursoTemp;
            }
        }
        return cursoMasCaro;
    }

    @Override
    public ArrayList<String> getPalabrasClave() {
        ArrayList<String> retorno = new ArrayList<>();
        for(Curso cur: cursos){
            ArrayList<String> palTemp = cur.getPalabrasClave();
            for(String p: palTemp){
                if(!retorno.contains(p)){
                    retorno.add(p);
                }
            }
        }
        return retorno;
    }

    @Override
    public int getPrecio() {
        int total = 0;
        int contador = 0;
        for(Curso c: cursos){
            total += c.getPrecio();
            contador++;
        }
        int precioFinal = contador*2%;
        if(precioFinal <= (total/2)){
            return total/2;
        } else {
            return total-precioFinal;
        }
    }

    @Override
    public ArrayList<String> getProfesores() {
        ArrayList<String> retorno = new ArrayList<>();
        for(Curso c: cursos){
            ArrayList<String> profTemp = c.getProfesores();
            for(String p : profTemp)
            if(!retorno.contains(p)){
                retorno.add(p);
            }
        }
        return retorno;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

}
