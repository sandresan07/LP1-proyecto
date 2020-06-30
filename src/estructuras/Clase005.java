/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import java.time.Clock;
import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class Clase005 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b, temp;
        System.out.println("Valor a= ");
        a = Integer.valueOf(teclado.nextLine());
        System.out.println("Valor b= ");
        b = Integer.valueOf(teclado.nextLine());
        teclado.close();
        System.out.println("["+a+","+b+"]");
        if(a>b){
            temp=a;
            a=b;
            b=temp;
        }
        do{
            System.out.println(a);
            a++;
        }while(a<=b);
        teclado.close();
    }
}
