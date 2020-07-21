/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea;

import utils.Leer;

/**
 *
 * @author sandr
 */
public class CRUDTAREA {
    public static String[] nombre=new String[1000];
    public static String[] dni=new String[1000];
    public static String[] club=new String[1000];
    public static String[] extranjeria=new String[1000];
    public static int posicion = -1;

    public static void agregarjugador(){
        String continuar;
        do{
            posicion++;
            System.out.println("Agregar jugador");
            System.out.println("Nombre:");
            nombre[posicion]=Leer.cadena();
            System.out.println("DNI:");
            dni[posicion]=Leer.cadena();
            System.out.println("Club:");
            club[posicion]=Leer.cadena();
            System.out.println("Extranjero:");
            extranjeria[posicion]=Leer.cadena();
            System.out.println("Deseas agregar otro? [S/N]");
            continuar=Leer.cadena();
        } while(continuar.equalsIgnoreCase("S"));
        
    }
    public static void eliminarjugador(){
        String continuar;
        do{
            listarjugador();
            System.out.print("Ingrese el numero del jugador a eliminar: ");
            int numero=Leer.entero();
            numero--;
            for (int i = numero; i < posicion; i++) {
                nombre[i]= nombre[i+1];
                dni[i]= dni[i+1];
                club[i]= club[i+1];
                extranjeria[i]= extranjeria[i+1];
            }
            nombre[posicion]="";
            dni[posicion]="";
            club[posicion]="";
            extranjeria[posicion]="";
            posicion--;
            System.out.println("Deseas eliminar otro? [S/N]");
            continuar=Leer.cadena();
        }while(continuar.equalsIgnoreCase("S"));
    }
    public static void editarjugador(){
        listarjugador();
        System.out.println("Ingrese el numero del jugador a editar: ");
        int numero=Leer.entero();
        numero--;
        System.out.println("Resultado: "+nombre[numero]+"(" + dni[numero] + ") -"+ club[numero]);
        System.out.println("Nuevo Nombre: ");
        nombre[numero]=Leer.cadena();
        System.out.println("Nuevo DNI: ");
        dni[numero]=Leer.cadena();
        System.out.println("Nueva club: ");
        club[numero]=Leer.cadena();
        
    }   
    public static void listarjugador(){
        System.out.println("Listado");
        System.out.println("N°\tDNI\t\tClub. \t\tNombre Completo");
        for (int i = 0; i <= posicion; i++) {
            System.out.println((i+1)+"\t"+dni[i]+"\t\t"+club[i]+"\t\t"+nombre[i]);
            
        }
    }
    public static void listarextranjeria(){
        System.out.println("Seleccione la categoria a mostrar: ");       
        System.out.println("1. Local");
        System.out.println("2. Extranjero"); 
        int numero=Leer.entero();
        numero--;
        for (int i = 0; i <= posicion; i++) {
        if(numero==1){            
            System.out.println(nombre[i]+(i+1)+"\t"+dni[i]+"\t"+club[i]+"\t"+nombre[i]);
        }else{
                System.out.println((i+1)+"\t"+dni[i]+"\t"+club[i]+"\t"+nombre[i]);
                }
    }
    }
    public static void salir(){
        System.out.println("Gracias por su visita.");
    }
    public static void error(){
        System.out.println("ERROR! Seleccione una opcion correcta");
    }
    public static void menu(){
        System.out.println("MENU PRINCIPAL");
        System.out.println("1. Agregar jugador");
        System.out.println("2. Eliminar jugador");
        System.out.println("3. Editar jugador");
        System.out.println("4. Listar jugadores");
        System.out.println("5. Listar extranjeros o no");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opcion: ");
    }
    public static void inicio(){
        int opcion;
        do{
            menu();
            opcion = Leer.entero();
            switch(opcion){
                case 1: 
                    agregarjugador();
                    break;
                case 2:
                    eliminarjugador();
                    break;
                case 3:
                    editarjugador();
                    break;
                case 4:
                    listarjugador();
                    break;
                case 5:
                    listarextranjeria();
                    break;
                case 6:
                    salir();
                    break;
                default:
                    error();
            }
        }while(opcion!=6);
    }
    public static void main(String[] args) {
        inicio();
        
    }
}

