package arreglos;

import utils.Leer;

public class Prog07 {
    public static int[]numeros=new int [100];
    public static int cantidad;
    public static int sumatoria;
    public static void ingresarvalores(){
        System.out.println("Ingresar valores del arreglo: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("numero["+i+"]: ");
            numeros[i]=Leer.entero();
        }
    }

    public static void sumatoria(){
        int sumatoria=0;
        for (int i = 0; i < cantidad; i++) {
            sumatoria+=numeros[i];
            
        }
        System.out.println("La sumatoria es:"+sumatoria);
    }
    public static void inicio(){
        System.out.println("Cantidad: ");
        cantidad=Leer.entero();
        ingresarvalores();
        sumatoria();
    }
    public static void main(String[] args) {
        inicio();
    }
}
