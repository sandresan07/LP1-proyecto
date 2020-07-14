package arreglos;


import utils.Leer;

public class Prog11 {
    public static  int[] numeros = new int[1000];
    public static int cantidad;
    public static void escribirarreglo (){
        do{
            numeros[cantidad]=Leer.entero();
            cantidad++;
        }while(numeros[cantidad-1]!=0);
     }
    public static void limpiararreglo (){
        for (int i = 0; i < cantidad; i++) {
            System.out.println("numeros ["+ i + "]= "+numeros[i]);
            
        }
     }
    public static void inicio() {
        System.out.println("Ingresar valores: ");
        escribirarreglo();
        limpiararreglo();       
    }
    
     public static void main(String[] args) {
        inicio();
        
    }
}
