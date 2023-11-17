/**
 * Muestra por pantalla la frase ¡Hola mundo! * 
 */
public class HolaMundo {
    public static void main(String[] args){
        String rojo = "\033[32m";
        String azul = "\033[34m";
        System.out.println(rojo + "Hola mundo!");
        System.out.println(azul + "Aqui estamos haciendo pruebas en Git.");
    }
}