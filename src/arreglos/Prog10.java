package arreglos;


import utils.Leer;

/**
 *
 * @author sandr
 */
public class Prog10 {
    public static  int[] numeros = new int[1000];
    public static int cantidad;
    
    public static void escribirarreglo (){
        System.out.println("Agregar valores al arreglo: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("numeros ["+ i + "]: ");
            numeros[i]= Leer.entero();
        }
     }
    
    public static void eliminarelemento(){
        int posicion;
        listararreglo();
        System.out.print("Indique la posicion a eliminar: ");
        posicion=Leer.entero();
        for (int i = posicion; i < cantidad-1; i++) {
            numeros[i]=numeros[i+1];
        }
        numeros[cantidad-1]=0;
        cantidad--;
    }
    public static void listararreglo(){
        System.out.println("Valores al arreglo: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("numeros ["+ i + "]: "+numeros[i]);
           
        }
    }
    public static void inicio() {
        System.out.println("Cantidad: ");
        cantidad=Leer.entero();
        escribirarreglo();
        eliminarelemento();
        listararreglo();       
    }
    
     public static void main(String[] args) {
        inicio();
        
    }
}
