/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import java.util.Scanner;
/**
 *
 * @author sandr
 */
public class Clase003 {
    public static void main(String[] args) {
           Scanner teclado = new Scanner(System.in);
        String cadena; 
           System.out.println("** MANEJO DE CADENAS **");
           System.out.print(" Leer cadena con nextLine():");
           cadena = teclado.nextLine();
           System.out.println("Valor inicial agregado es: "+ cadena );
           System.out.println(" Mayuscula con toUpperCase():" + cadena.toUpperCase());
           System.out.println("minuscula con toLowerCase ():" + cadena.toLowerCase());
           System.out.println("Elimina espacios con trim:" + cadena.trim());
           System.out.println("Subcadena con substring (int)" + cadena.substring(5));
           System.out.println("Subcadena con substring (int,int)" + cadena.substring(5,10));
           System.out.println("tamaño de una cadena: "+cadena.length());
           System.out.println("extraer letra: " + cadena.charAt(0));
           System.out.println("extraer letra: " + cadena.charAt(1));
           System.out.println("extraer letra: " + cadena.charAt(2));
           System.out.println("extraer letra: " + cadena.charAt(3));
           System.out.println("extraer letra: " + cadena.charAt(4));
           System.out.println("extraer letra: " + cadena.charAt(5));
           System.out.println("extraer letra: " + cadena.charAt(6));
           System.out.println("extraer letra: " + cadena.charAt(cadena.length()-1));
           teclado.close();
    }
    }
    
}
