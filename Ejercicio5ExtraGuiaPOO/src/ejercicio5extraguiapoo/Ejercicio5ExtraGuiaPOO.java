package ejercicio5extraguiapoo;

import entidad.Meses;
import java.util.Scanner;



public class Ejercicio5ExtraGuiaPOO {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Meses m1 = new Meses();
        
        System.out.println("Adivine un mes");
        String adivina = leer.next();
        
        while(!(adivina.equals(m1.getMesSecreto()))){
            System.out.println("Incorrecto, ingrese nuevamente un mes");
            adivina = leer.next();
        }
        
        System.out.println("Correcto!");
    }
    
}
