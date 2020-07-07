package modularidad;

/**
 *
 * @author sandr
 */
public class Prog02 {
    //Metodos que reciben parametros
    public static void saludo(String nombre){
        System.out.println("Bienvenido " + nombre);
        System.out.println("Disfruta tu estadia en este lugar");
    }
    public static void saludo2(String nombre, String carrera){
        System.out.println("Disfruta tu estadia en la carrera de " + carrera);
        
    }
    public static void main(String[] args) {
        saludo("Daniel");
        saludo2("Juan","Ing. de Sistemas");
    }
    
}
