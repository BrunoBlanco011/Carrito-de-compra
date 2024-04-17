
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean flag = true;

        label81:
        do {
            System.out.println("Decida el usuario a acceder");
            System.out.println("1.- Administrador");
            System.out.println("2.- Cliente");
            System.out.println("3.- Salir");
            int decision = teclado.nextInt();
            Inventario inventario = new Inventario();
            Cliente cliente = new Cliente();
            boolean client;
            int caso1;
            switch (decision) {
                case 1:
                    boolean admin1 = true;
                    client = true;

                    label75:
                    while(true) {
                        label73:
                        while(true) {
                            if (!admin1) {
                                break label75;
                            }

                            System.out.println("Menú administrador");
                            System.out.println("1.- Agregar producto");
                            System.out.println("2.- Ver productos");
                            System.out.println("3.- Salir");
                            caso1 = teclado.nextInt();
                            switch (caso1) {
                                case 1:
                                    System.out.println("ingrese el nombre del producto");
                                    teclado.nextLine();
                                    String nombreProducto = teclado.nextLine();
                                    System.out.println("ingrese el precio");
                                    double precioProducto = teclado.nextDouble();
                                    inventario.agregarProducto(nombreProducto, precioProducto);
                                    break;
                                case 2:
                                    System.out.println("Los productos en stock son");
                                    Iterator var12 = inventario.getProductos().iterator();

                                    while(true) {
                                        if (!var12.hasNext()) {
                                            continue label73;
                                        }

                                        Producto producto = (Producto)var12.next();
                                        System.out.println("Nombre: " + producto.getNombre());
                                        System.out.println("Precio: $" + producto.getPrecio());
                                    }
                                case 3:
                                    admin1 = false;
                            }
                        }
                    }
                case 2:
                    while(true) {
                        label57:
                        while(true) {
                            client = true;
                            if (false) {
                                continue label81;
                            }

                            System.out.println("Menú cliente");
                            System.out.println("1.- Ver productos disponibles");
                            System.out.println("2.- Agregar producto al carrito");
                            System.out.println("3.- Ver el carrito");
                            System.out.println("4.- Generar pago");
                            System.out.println("5.- Salir");
                            caso1 = teclado.nextInt();
                            int i;
                            Producto producto;
                            switch (caso1) {
                                case 1:
                                    System.out.println("Productos disponibles:");
                                    i = 0;

                                    while(true) {
                                        if (i >= inventario.getProductos().size()) {
                                            continue label57;
                                        }

                                        producto = (Producto)inventario.getProductos().get(i);
                                        System.out.println(i + 1 + ". " + producto.getNombre() + " - $" + producto.getPrecio());
                                        ++i;
                                    }
                                case 2:
                                    System.out.println("Ingrese el número del producto que desea agregar al carrito:");
                                    i = teclado.nextInt();
                                    if (i >= 1 && i <= inventario.getProductos().size()) {
                                        producto = (Producto)inventario.getProductos().get(i - 1);
                                        cliente.agregarAlCarrito(producto);
                                        System.out.println("Producto agregado al carrito.");
                                        break;
                                    }

                                    System.out.println("Número de producto inválido.");
                                    break;
                                case 3:
                                    Iterator var15 = cliente.getCarrito().iterator();

                                    while(true) {
                                        if (!var15.hasNext()) {
                                            continue label57;
                                        }

                                        Producto producto1 = (Producto)var15.next();
                                        System.out.println("Nombre: " + producto1.getNombre());
                                        System.out.println("Precio: $" + producto1.getPrecio());
                                    }
                                case 4:
                                    new Cliente();
                                    Admin admin = new Admin(inventario);
                                    double total = cliente.getPrecioTotal(admin);
                                    System.out.println("Total a pagar: $" + total);
                                    break;
                                case 5:
                                    client = false;
                            }
                        }
                    }
                case 3:
                    System.out.println("Programa terminado");
                    flag = false;
            }
        } while(flag);

    }
}
