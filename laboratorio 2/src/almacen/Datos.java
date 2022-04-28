/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacen;

/**
 *
 * @author Javier Guerrini
 */
public class Datos {
    
    int f,c;
    
    Bebidas [][] estanteria;

    public Datos(int f, int c) {
        this.f = f;
        this.c = c;
        this.estanteria = new Bebidas[f][c];
    }
    public void getEstanteria(){
        int x,i;
        for(x=0;x<f;x++){
            for(i=0;i<c;i++){
                if(estanteria[x][i] != null) System.out.print(estanteria[x][i].getID() + " ");
            }
            System.out.print("\n");
        }
    }
    public void agregarProductos(Bebidas bebida){
        
        int x,i;
        boolean libre = false, idRepetido = false;
        for(x=0;x<f && !libre;x++){
            for(i=0;i<c && !libre;i++){
                if(estanteria[x][i] != null){
                    if(estanteria[x][i].getID() == bebida.getID()) idRepetido = true;
                }
                if(estanteria[x][i] == null && !idRepetido){
                    libre = true;
                    estanteria[x][i] = bebida;
                } 
            }
        }
    }
    public void eliminarProducto(String idProducto){
        int x,i;
        boolean encontrado = false;
        for(x=0;x<f && !encontrado;x++){
            for(i=0;i<c && !encontrado;i++){
                if(idProducto == estanteria[x][i].getID()){
                    estanteria[x][i] = null;
                    encontrado = true;
                }
            }
        }
    }
    public double calcularPrecios(){
        int x,i;
        double total = 0;
        for(x = 0; x < f; x++){
            for(i = 0; i < c; i++){
                if(estanteria[x][i] != null) total += estanteria[x][i].getPrecio();
            }
        }
        return total;
    } 
    public double calcularPrecioMarca(Bebidas bebida){
        double total = 0;
        int x,i;
        for(x=0;x<f;x++){
            for(i=0;i<c;i++){
                if(estanteria[x][i] != null && bebida.getMarca() == estanteria[x][i].getMarca()){
                    total += estanteria[x][i].getPrecio();
                }
            }
        }  
        return total;
    }
    public String mostrarInfo(){
        String info = "";
        int x,i;  
        for(x=0;x<f;x++){
            for(i=0;i<c;i++){
                if(estanteria[x][i] != null){
                    Bebidas b = estanteria[x][i];
                    info += b.toString() + "\n";
                }
            }
        }  
        return info;
    } 
}
