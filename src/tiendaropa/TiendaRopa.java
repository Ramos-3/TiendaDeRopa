/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendaropa;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author diego
 */
public class TiendaRopa {
  private List<Producto> catalogo;
  public TiendaRopa() {
        catalogo = new ArrayList<>();
    }
   public void agregarProducto(Producto producto) {
        catalogo.add(producto);
    }
  public void mostrarCatalogo() {
        for (Producto producto : catalogo) {
            producto.mostrarInformacion();
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TiendaRopa tienda = new TiendaRopa();

        Ropa camisa = new Ropa("Camisa", 30.0, "M");
        Ropa pantalon = new Ropa("Pantalón", 45.0, "L");

        tienda.agregarProducto(camisa);
        tienda.agregarProducto(pantalon);

        System.out.println("Catálogo de productos:");
        tienda.mostrarCatalogo();
    }
    
}
