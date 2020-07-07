package Tarea;

import utils.Leer;

public class Operaciones {
    public static void positivo(){
        System.out.println("*** POSITIVO O NEGATIVO");
        int num;
        System.out.println("Ingrese el numero: ");
        num = Leer.entero();
        if(num>0){
            System.out.println("Es positivo");
        }else if (num==0){
            System.out.println("El numero es Cero");
        }else {
            System.out.println("Es negativo");
        }                     
    }
    public static void entero(){
        System.out.println("*** ENTERO O DECIMAL");
        double num;
        System.out.println("Ingrese el numero: ");
        num = Leer.decimal();
        if(num%1==0){
            System.out.println("Es entero");
        }else {
            System.out.println("Es decimal");
        }          
    }
    public static void potencia(){
        System.out.println("*** POTENCIA AL CUADRADO ***");
        int num, pot;
        System.out.print("Ingrese numero:");
        num = Leer.entero();
      
            pot=num*num;
        
        System.out.println(pot);
    }
    public static void raiz(){
        System.out.println("*** RAIZ CUADRADA ***");
        System.out.print("Ingrese numero:");
        int num= Leer.entero();       
        double resultado;
        resultado= Math.sqrt(num);
        System.out.println("la raiz es: "+resultado);
    }
    public static void error(){
        System.out.println("Error. Opcion Incorrecta.");
    }
    public static void salir(){
        System.out.println("Gracias por visitarnos");
    }
    public static void menu(){
        System.out.println("Menu Principal");
        System.out.println("1. Potencia al cuadrado");
        System.out.println("2. Raiz");
        System.out.println("3. Entero o decimal");
        System.out.println("4. Positivo o negativo");
        System.out.println("5. Salir");
        System.out.print("Ingrese opcion [1-5]:");
    }
    public static void inicio(){
        int opcion;
        do{
            menu();
            opcion = Leer.entero();
            switch(opcion){
                case 1: potencia();
                break;
                case 2: raiz();
                break;
                case 3: entero();
                break;
                case 4: positivo();
                break;
                case 5: salir();
                break;
                default:error();
            }
            
        }while(opcion!=5);        
    }
    public static void main(String[] args) {
        inicio();
    }
}
