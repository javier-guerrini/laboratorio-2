/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacen;

/**
 *
 * @author Javier Guerrini
 */
public class Agua extends Bebidas{
    String origen;
    public Agua(String origen, String ID, double cantidadLitros, double precio, String marca) {
        super(ID, cantidadLitros, precio, marca);
        this.origen = origen;
    }
    @Override
    public String toString() {
        return "ID:" + this.ID + " Marca:" + this.marca + " Litros:" + this.cantidadLitros + " Precio:$" + this.precio + " Origen:" + this.origen;
    }
    
    
}
