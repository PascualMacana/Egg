package servicio;

import entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author emiliano
 */
public class PersonaServicio {
    Scanner leer = new Scanner(System.in);
    Persona per1 = new Persona();
    
    
    public Persona crearPersona(){
        
        System.out.println("Ingrese su nombre");
        per1.setNombre(leer.nextLine());
        System.out.println("Ingrese el anio que nacio (Recorda que al anio se le resta 1900)");
        int anio = leer.nextInt();
        System.out.println("Ingrese el mes que nacio");
        int mes = leer.nextInt();
        System.out.println("Ingrese el dia que nacio");
        int dia = leer.nextInt();
        
        Date nacimiento = new Date(anio, mes, dia);
        
        per1.setNacimiento(nacimiento);
        System.out.println(nacimiento);//Para corroborar que se guardo correctamente la fecha.
        return per1;
    }
    
    public Persona calcularEdad(Persona per1,Date nacimiento){
        Date fechaActual = new Date();
        
        System.out.println(fechaActual.getYear() - nacimiento.getYear() + " anios");
        return per1;
    }
    //Ver el nacimiento porque no funciona este metodo
    public boolean menorQue(Date nacimiento, int edad){
        boolean menorMayor;
        Date fechaActual = new Date();
        
        if (fechaActual.getYear() - nacimiento.getYear() < edad){
            menorMayor = true;
        }else {
            menorMayor = false;
        }
        return menorMayor;
    }
    
    public Persona mostrarPersona(){
        System.out.println(per1.toString());
        return per1;
    }
    
}
