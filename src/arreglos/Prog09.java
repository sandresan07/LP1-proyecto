/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import utils.Leer;

/**
 *
 * @author sandr
 */
public class Prog09 {
    public static  int[] numeros = new int[1000];
    public static int cantidad;
    
    public static void escribirarreglo (){
        System.out.println("Agregar valores al arreglo: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("numeros ["+ i + "]: ");
            numeros[i]= Leer.entero();
        }
     }
    
    public static String parimpar(int numero){
        String resultado;
        if(numero%2==0){
            resultado="Par";
        }else{
            resultado="Impar";
        }
        return resultado;
    }
    
    public static String positivonegativo(int numero){
        String resultado;
        if(numero>0){
            resultado="Positivo";
        }else if(numero<0){
            resultado="Negativo";
        }else {
            resultado="Neutro";
        }
        return resultado;
    }
        public static void imprimir() {
         System.out.println("Resultado: ");
         for (int i = 0; i < cantidad; i++) {
             System.out.println(numeros[i] + ": " + positivonegativo(numeros[i])+"-"+parimpar(numeros[i]));
             
         }
        
    }
    
    public static void inicio() {
        System.out.println("Cantidad: ");
        cantidad=Leer.entero();
        escribirarreglo();
        imprimir();
        
    }
    
     public static void main(String[] args) {
        inicio();
        
    }
}
