// elementoVenta: nombre, marca, precio, volumen

public abstract class ElementoVenta {
    
    // Declaracion de variables
    
    private String nombre;
    private String marca;

    // Constructor

    public ElementoVenta(String n, String m){
        this.nombre = n;
        this.marca = m;
    }

    // funciones abstractas 

    public abstract double getVolumen();

    public abstract int getPrecio();

    public abstract int cantProductos();

    // funciones basicas (get & set)

    public String getMarca() {
        return marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
