package ejercicio1extraguiapoo;

import entidad.Cancion;
import java.util.Scanner;

public class Ejercicio1ExtraGuiaPoo {

   
    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        Cancion can1 = new Cancion();
        
        System.out.println("Ingrese el titulo de la cancion");
        can1.setTitulo(ingresar.nextLine());
        
        System.out.println("Ingrese el autor de la cancion");
        can1.setAutor(ingresar.nextLine());
        
        System.out.println(can1.toString());
    }
    
}
