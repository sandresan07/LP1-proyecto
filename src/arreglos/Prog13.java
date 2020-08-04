
package arreglos;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author sandr
 */
public class Prog13 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        //Agregar elementos a un arraylist
        numeros.add(5);
        numeros.add(15);
        numeros.add(25);
        numeros.add(100);
        numeros.add(-30);
        System.out.println("Valores del ArrayList: " + numeros.toString());
        
        System.out.println("Eliminando la posicion 2 del ArrayList");
        numeros.remove(2);
        System.out.println("Valores del ArrayList: " + numeros.toString());
        
        System.out.println("\nInsertamos 1000 en la posicion 2 del ArrayList");
        numeros.add(2, 1000);
        System.out.println("Valores del ArrayList: " + numeros.toString());
        
        System.out.println("\nPara ordenar los elementos del ArrayList");
        Collections.sort(numeros);
        System.out.println("Valores del ArrayList: " + numeros.toString());
        
        System.out.println("\nOtra forma de imprimir los valores del ArrayList(For-Each)");
        for (Integer numero : numeros) {
            System.out.println(numero);
            
        }
    }
}
