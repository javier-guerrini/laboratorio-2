/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package almacen;

/**
 * @author Javier Guerrini
 */
public class Almacen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BebidaAzucarada gaseosa1 = new BebidaAzucarada(true,30,"01",2, 200, "pepsi");
        Agua agua1 = new Agua("los andes", "02", 1.5, 90, "Glaciar");
        BebidaAzucarada gaseosa2 = new BebidaAzucarada(false,325,"03",2.5, 250, "coca");
        Agua agua2 = new Agua("manantiales del sur", "04", 2, 110, "villavicencio");

        BebidaAzucarada gaseosa3 = new BebidaAzucarada(false,325,"03",2.5, 250, "coca");
        
        Datos datos = new Datos(3,3);
   
        datos.agregarProductos(agua1);
        datos.agregarProductos(agua2);
        datos.agregarProductos(gaseosa1);
        datos.agregarProductos(gaseosa2);
        
        datos.agregarProductos(gaseosa3);
       
        datos.getEstanteria();
       
        datos.eliminarProducto(gaseosa2.getID());
        datos.getEstanteria();
        
        System.out.println("El precio de todas las bebidas es: $" + datos.calcularPrecios());
        System.out.println("El precio de todas las bebidas marca '" + agua1.getMarca() + "' es: $" + datos.calcularPrecioMarca(agua1)); 
        System.out.println("\n" + "Bebidas de la estanteria:\n" + datos.mostrarInfo());   
    }
    
}
