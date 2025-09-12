import java.util.ArrayList;

public abstract class elemento {
    private String nombre;

    public elemento(String n){
        this.nombre = n;
    }

    public abstract int getPrecio();
    public abstract int getCantCursos();
    public abstract Curso getCursoMasCaro();
    public abstract ArrayList<String> getPalabrasClave();
    public abstract ArrayList<String> getProfesores();
    public abstract ArrayList<Curso> buscar(Condicion c);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
