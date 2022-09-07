package ejercicio12guiapoo;

import entidad.Persona;
import java.util.Date;
import java.util.Scanner;
import servicio.PersonaServicio;

public class Ejercicio12GuiaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        PersonaServicio ps = new PersonaServicio();
        Persona per1 = ps.crearPersona();
        
        Date nacimiento = per1.getNacimiento(); //Atento a esta variable. OJOO!!!!!
        
        per1 = ps.calcularEdad(per1, nacimiento);
        
        
        System.out.println("Ingrese una edad para compararlo");
        int edad = ingresar.nextInt();
        
        System.out.println(ps.menorQue(nacimiento, edad));
        ps.mostrarPersona();
    }
    
}
