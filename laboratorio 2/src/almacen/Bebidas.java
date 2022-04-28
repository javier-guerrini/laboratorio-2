/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacen;

/**
 *
 * @author Javier Guerrini
 */
public class Bebidas {
    String ID;
    double cantidadLitros;
    double precio;
    String marca;

    public Bebidas(String ID, double cantidadLitros, double precio, String marca) {
        this.ID = ID;
        this.cantidadLitros = cantidadLitros;
        this.precio = precio;
        this.marca = marca;
    }
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public double getCantidadLitros() {
        return cantidadLitros;
    }
    public void setCantidadLitros(double cantidadLitros) {
        this.cantidadLitros = cantidadLitros;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
}
