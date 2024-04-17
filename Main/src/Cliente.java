import java.util.ArrayList;

public class Cliente {
    private ArrayList<Producto> carrito;

    public Cliente() {
        this.carrito = new ArrayList<>();
    }

    public void agregarAlCarrito(Producto producto) {
        carrito.add(producto);
    }

    public ArrayList<Producto> getCarrito() {
        return carrito;
    }

    public double getPrecioTotal(Admin admin) {
        return admin.calcularTotal(this);
    }
}