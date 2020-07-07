package modularidad;

/**
 *
 * @author sandr
 */
public class Prog03 {
    //Metodos que devuelven valores
    public static String miuniversidad(){
        String universidad="Universidad Nacional Tecnologica de Lima Sur";
        return universidad;
    }
    public static void main(String[] args) {
        System.out.println(miuniversidad());
        System.out.println(miuniversidad().toUpperCase());
    }
    
}
