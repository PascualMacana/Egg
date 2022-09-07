package ejercicio6extraguiapoo;

import entidad.Ahorcado;
import java.util.Scanner;
import servicio.AhoracoServicio;

public class Ejercicio6ExtraGuiaPOO {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        AhoracoServicio as = new AhoracoServicio();
        Ahorcado hang = as.crearJuego();
        
        
        
        while (hang.getJugadasMax() != 0){
            System.out.println("Ingrese una letra para ver si esta en la palabra");
            char letra = leer.next().charAt(0); //Metodo para leer un char, con un string no me andaba el codigo.
            as.juego(hang, letra);
        }  
    }
    
}
