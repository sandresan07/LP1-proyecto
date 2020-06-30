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
public class Clase06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int S=0, N;
        System.out.println("N:");N=Integer.valueOf(teclado.nextLine());
        for(int a=1; a<=N; a++){
            S = S + a;
        }
        System.out.print("S= "+S);
        teclado.close();
    }
}
