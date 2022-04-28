/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacen;

/**
 *
 * @author Javier Guerrini
 */
public class BebidaAzucarada extends Bebidas{
    
    boolean promocion; 
    double porcentajeAzucar;

    public BebidaAzucarada(boolean promocion, double porcentajeAzucar, String ID, double cantidadLitros, double precio, String marca) {
        super(ID, cantidadLitros, precio, marca);
        this.promocion = promocion;
        this.porcentajeAzucar = porcentajeAzucar;
        if(promocion) this.precio = precio * 0.9;
    }
    @Override
    public String toString() {
        return "ID:" + this.ID + " Marca:" + this.marca + " Litros:" + this.cantidadLitros + " Precio:$" + this.precio + " Promocion:" + this.promocion + " Porcentaje de azucar:" + this.porcentajeAzucar;
    }
}
