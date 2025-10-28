public class CondicionPorNombre extends Condicion {
    private String nombre; // nico
    public CondicionPorNombre(String n){
        nombre = n;
    }

    @Override
    boolean cumple(Elemento e) {
        return nombre == e.getTitulo();
    }
}
