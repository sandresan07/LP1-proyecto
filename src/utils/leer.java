package utils;

import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class leer {
    public static Scanner teclado = new Scanner(System.in);
    
    public static String cadena(){
        //nextline : Leer cadena
        return teclado.nextLine();
    }
    public static int entero(){
        return Integer.valueOf(cadena());
    }
    public static double decimal(){
        return Double.valueOf(cadena());
    }
    public static char letra(){
        return cadena().charAt(0);
    }
}
