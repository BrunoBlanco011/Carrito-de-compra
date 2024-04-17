import java.util.ArrayList;
public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    protected void agregarProducto(String nombre, double precio) {

        // Crear un nuevo producto
        Producto producto = new Producto(nombre, precio);

        // Agregar el producto a la lista
        productos.add(producto);
    }

    public ArrayList<Producto> getProductos(){

        return productos;
    }
}



