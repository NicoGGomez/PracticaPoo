// elementoVenta: nombre, marca, precio, volumen

// producto: nombre, marca, precio, volumen (cm cubicos)
// ejemplo
// "fibra 710", "marca pelikan", 181, 95 cm3

// paquete: nombre, marca, precio (suma de todo sus productos), volumen (del producto de mayor volumen) contiene productos o mismos paquete


public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("lapiz", "bic", 100, 50);
        Producto p2 = new Producto("lapicera negra", "bic", 300, 100);
        Producto p3 = new Producto("lapicera azul", "bic", 300, 100);
        Producto p4 = new Producto("fibron", "posca", 500, 400);

        Paquete paq1 = new Paquete("paquete god", "varias");
        Paquete paq2 = new Paquete("paquete bic", "bic");
        Paquete paqueteGrande = new Paquete("Paquete grande", "todas");
        paq1.agregarProducto(p1);
        paq1.agregarProducto(p2);
        paq1.agregarProducto(p3);
        paq1.agregarProducto(p4);

        paq2.agregarProducto(p1);
        paq2.agregarProducto(p2);
        paq2.agregarProducto(p3);

        paqueteGrande.agregarProducto(paq1);
        paqueteGrande.agregarProducto(paq2);

        System.out.println("paquete 1");
        System.out.println(paq1.getPrecio());
        System.out.println(paq1.cantProductos());

        System.out.println("paquete 2");
        System.out.println(paq2.getPrecio());
        System.out.println(paq2.cantProductos());

        System.out.println("paquete grande");
        System.out.println(paqueteGrande.getPrecio());
        System.out.println(paqueteGrande.getVolumen());
        System.out.println(paqueteGrande.cantProductos());

    }
}