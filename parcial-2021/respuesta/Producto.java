// producto: nombre, marca, precio, volumen (cm cubicos)
// ejemplo
// "fibra 710", "marca pelikan", 181, 95 cm3

public class Producto extends ElementoVenta {
    private int precio;
    private double volumen;

    public Producto(String n, String m, int p, double v){
        super(n,m);
        this.precio = p;
        this.volumen = v;
    }

    // funciones abstraidas

    @Override
    public int cantProductos() {
        return 1;
    }

    @Override
    public double getVolumen() {
        return volumen;
    }
    
    public int getPrecio() {
        return precio;
    }

    // funciones basicas

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
 
}
