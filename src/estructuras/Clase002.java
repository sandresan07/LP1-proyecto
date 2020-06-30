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
public class Clase002 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double importe;
        System.out.println("Importe: ");
        importe = Double.valueOf(teclado.nextLine());
        System.out.println("Categoria: ");
        if( importe >4000){
            System.out.println("D");
        }
        else if(importe >2000){
            System.out.println("C");
        }
        else if(importe >100){
            System.out.println("B");
        }
        else if(importe >=0){
            System.out.println("A");
        }
        else{
            System.out.println("Fuera de rango");
        }
        teclado.close();
    }
    
}
