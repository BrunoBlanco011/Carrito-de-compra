import java.util.Scanner;
import java.util.ArrayList;

public class Admin {
    private Inventario inventario;

    public Admin(Inventario inventario) {
        this.inventario = inventario;
    }


    public void agregar(String nombre, int cantidad) {
        inventario.agregarProducto(nombre, cantidad);
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }
    public double calcularTotal(Cliente cliente) {
        double total = 0.0;
        for (Producto producto : cliente.getCarrito()) {
            total += producto.getPrecio();
        }
        return total;
    }
}

