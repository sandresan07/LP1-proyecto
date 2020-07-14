package arreglos;

import utils.Leer;


public class Prog06 {
    public static int[] numeros = new int [100];
    public static int cantidad;
    
    public static void escribirarreglo(){
        System.out.println("Agregar valores del arreglo: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("numero [" + i + "]: ");
            numeros[i]=Leer.entero();
        }
    }
    public static void imprimirarreglo(){
        System.out.println("Valores del arreglo");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("numero[" +i+ "]: "+numeros[i]);
        }
    }
    public static void inicio(){
        System.out.println("Cantidad de elementos: ");
        cantidad = Leer.entero();
        escribirarreglo();
        imprimirarreglo();
    }
    public static void main(String[] args) {
        inicio();
    }
    
}
