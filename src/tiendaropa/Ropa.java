/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaropa;

/**
 *
 * @author diego
 */
public class Ropa extends Producto implements Descuento {
    private String talla;

    public Ropa(String nombre, double precio, String talla) {
        super(nombre, precio);
        this.talla = talla;
    }
    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Talla: " + talla);
        System.out.println("Precio: $" + precio);
    }
    @Override
     public double aplicarDescuento(double descuentoPorcentaje) {
        double descuento = (descuentoPorcentaje / 100) * precio;
        precio -= descuento;
        return precio;
    }
}
