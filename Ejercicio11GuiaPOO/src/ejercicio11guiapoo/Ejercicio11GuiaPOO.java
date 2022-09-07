package ejercicio11guiapoo;


import java.util.Date;
import java.util.Scanner;

public class Ejercicio11GuiaPOO {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Al anio le tenemos que sumar 1900, ej: 116 + 1900 = 2016
        System.out.println("Ingrese un anio");
        int anio = leer.nextInt();
        //Los meses son de 0 a 11, por lo tanto va defasado 
        System.out.println("Ingrese un mes");
        int mes = leer.nextInt();
        
        System.out.println("Ingrese un dia");
        int dia = leer.nextInt();
        
        Date fecha = new Date(anio, mes, dia);
        
        //Fecha actual.
        Date fechaActual = new Date();
        
        System.out.println(fecha);
        
        //Diferencia en anios.
        System.out.println("La diferencia en anios es de: " + (fechaActual.getYear() - fecha.getYear()));
      
        
    }
    
}
