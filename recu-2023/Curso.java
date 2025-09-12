import java.util.ArrayList;

public class Curso extends elemento {
    private int precio;
    protected ArrayList<String> palabrasClave;
    protected ArrayList<String> profesores;    

    public Curso(String n, int p){
        super(n);
        this.precio = p;
        palabrasClave = new ArrayList<>();
        profesores = new ArrayList<>();
    }

    public int getCantDoc(){
        return this.getProfesores().size();
    }
    
    @Override
    public ArrayList<Curso> buscar(Condicion c) {
        ArrayList<Curso> retorno = new ArrayList<>();
        if(c.cumple(this)){
            retorno.add(this);
        }
        return retorno;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public ArrayList<String> getProfesores() {
        ArrayList<String> retorno = new ArrayList<>();
        for(String p : profesores){
            if (!retorno.contains(p)) {
                retorno.add(p);
            }
        }
        return retorno;
    }

    @Override
    public int getCantCursos() {
        return 1;
    }

    @Override
    public Curso getCursoMasCaro() {
        return this;
    }

    @Override
    public ArrayList<String> getPalabrasClave() {
        ArrayList<String> retorno = new ArrayList<>();
        for(String p : palabrasClave){
            if (!retorno.contains(p)) {
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
