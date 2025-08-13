// paquete: nombre, marca, precio (suma de todo sus productos), volumen (del producto de mayor volumen) contiene productos o mismos paquete

import java.util.ArrayList;

public class Paquete extends ElementoVenta {
    private int precio;
    private double volumen;
    ArrayList<ElementoVenta> productos;

    public Paquete(String n, String m){
        super(n,m);
        productos = new ArrayList<>();
    }

    // metodos abstraidos

    @Override
    public int cantProductos() {
        int cantidad = 0;
        for(ElementoVenta p: productos){
            cantidad += p.cantProductos();
        }
        return cantidad;
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

    public int getPrecio() {
        int precioTotal = 0;
        for(ElementoVenta p: productos){
            precioTotal += p.getPrecio();
        }
        return precioTotal;
    }

    // metodos de clase

    public void agregarProducto(ElementoVenta p){
        productos.add(p);
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

}
