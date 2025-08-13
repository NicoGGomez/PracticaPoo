// paquete: nombre, marca, precio (suma de todo sus productos), volumen (del producto de mayor volumen) contiene productos o mismos paquete

import java.util.ArrayList;

public class Paquete extends ElementoVenta {
    private int precio;
    private double volumen;
    ArrayList<ElementoVenta> productos;

    public Paquete(String n, String m, int p, double v){
        super(n,m);
        this.precio = p;
        this.volumen = v;
        productos = new ArrayList<>();
    }

    @Override
    public double getVolumen() {
        double maxTemp = 0;
        double max = 0;
        for (ElementoVenta p : productos) {
            maxTemp = p.getVolumen();
            if (maxTemp > max) {
                max = maxTemp;
            }
        }
        return max;
    }

    public void agregarProducto(ElementoVenta p){
        productos.add(p);
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

}
