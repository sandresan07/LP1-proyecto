/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import utils.Leer;

/*
persona
- Nombre
- DNI
- Fecha de nacimiento
*/

/**MENU PRINCIPAL
 1. Agregar personas
 2. Eliminar personas
 3. Editar personas
 4. Listar personas
 5. Salir
 */
public class CRUD {
    public static String[] nombre=new String[1000];
    public static String[] dni=new String[1000];
    public static String[] fnacimiento=new String[1000];
    public static int posicion = -1;
    
    public static void agregarpersona(){
        String continuar;
        do{
            posicion++;
            System.out.println("Agregar persona");
            System.out.println("Nombre:");
            nombre[posicion]=Leer.cadena();
            System.out.println("DNI:");
            dni[posicion]=Leer.cadena();
            System.out.println("Fecha de nacimiento:");
            fnacimiento[posicion]=Leer.cadena();
            System.out.println("Deseas agregar otro? [S/N]");
            continuar=Leer.cadena();
        } while(continuar.equalsIgnoreCase("S"));
        
    }
    public static void eliminarpersona(){
        String continuar;
        do{
            listarpersona();
            System.out.print("Ingrese el numero de la persona a eliminar: ");
            int numero=Leer.entero();
            numero--;
            for (int i = numero; i < posicion; i++) {
                nombre[i]= nombre[i+1];
                dni[i]= dni[i+1];
                fnacimiento[i]= fnacimiento[i+1];
            }
            nombre[posicion]="";
            dni[posicion]="";
            fnacimiento[posicion]="";
            posicion--;
            System.out.println("Deseas eliminar otro? [S/N]");
            continuar=Leer.cadena();
        }while(continuar.equalsIgnoreCase("S"));
    }
    public static void editarpersona(){
        listarpersona();
        System.out.println("Ingrese el numero de persona a editar: ");
        int numero=Leer.entero();
        numero--;
        System.out.println("Resultado: "+nombre[numero]+"(" + dni[numero] + ") -"+ fnacimiento[numero]);
        System.out.println("Nuevo Nombre: ");
        nombre[numero]=Leer.cadena();
        System.out.println("Nuevo DNI: ");
        dni[numero]=Leer.cadena();
        System.out.println("Nueva fecha de nacimiento: ");
        fnacimiento[numero]=Leer.cadena();
        
    }   
    public static void listarpersona(){
        System.out.println("Listado");
        System.out.println("N°\tDNI\t\tF. Nac. \t\tNombre Completo");
        for (int i = 0; i <= posicion; i++) {
            System.out.println((i+1)+"\t"+dni[i]+"\t"+fnacimiento[i]+"\t"+nombre[i]);
            
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
        System.out.println("1. Agregar personas");
        System.out.println("2. Eliminar personas");
        System.out.println("3. Editar personas");
        System.out.println("4. Listar personas");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opcion: ");
    }
    public static void inicio(){
        int opcion;
        do{
            menu();
            opcion = Leer.entero();
            switch(opcion){
                case 1: 
                    agregarpersona();
                    break;
                case 2:
                    eliminarpersona();
                    break;
                case 3:
                    editarpersona();
                    break;
                case 4:
                    listarpersona();
                    break;
                case 5:
                    salir();
                    break;
                default:
                    error();
            }
        }while(opcion!=5);
    }
    public static void main(String[] args) {
        inicio();
        
    }
}
