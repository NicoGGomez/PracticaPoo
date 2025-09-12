import java.util.ArrayList;

public class Libreria {
    private ArrayList<ElementoVenta> productos;

    public Libreria(){
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(ElementoVenta p){
        productos.add(p);
    }

}
