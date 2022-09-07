package ejercicio8guiapoo;

import entidad.Cadena;
import java.util.Scanner;
import servicio.CadenaServicio;

public class Ejercicio8GuiaPOO {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Cadena c1 = new Cadena();
        
        System.out.println("Ingrese una frase");
        c1.setFrase(leer.nextLine());
        
        //Para ponerle la longitud de la frase a la variable longitud
        c1.setLongitud(c1.getFrase().length());
        System.out.println(c1.getLongitud());
        
        
        //Llamamiento de metodos
        CadenaServicio cs = new CadenaServicio();
        c1 = cs.mostrarVocales(c1);
        
        c1= cs.invertirFrase(c1);
        
        System.out.println("************************************************");
        System.out.println("Ingrese una letra para ver cuantas veces se repite");
        String letra = leer.next();
        c1 = cs.vecesRepetido(c1, letra);
        
        System.out.println("************************************************");
        System.out.println("Ingrese una frase para comparar su longitud");
        String segundaFrase = leer.next();
        c1 = cs.compararLongitud(c1, segundaFrase);
        
        System.out.println("************************************************");
        System.out.println("Ingrese una frase para unirla");
        String unir = leer.next();
        c1 = cs.unirFrases(c1, unir);
        
        System.out.println("************************************************");
        System.out.println("Se van a reemplazar todas las a de la frase. Ingrese un caracter por el cual desea reemplazarla");
        String letraRemplazar = leer.next();
        c1 = cs.reemplazar(c1, letraRemplazar);
        
        System.out.println("************************************************");
        System.out.println("Ingrese una letra para ver si la contiene la frase que ingreso originalmente");
        String letraEncontrar = leer.next();
        c1 = cs.contiene(c1, letraEncontrar);
    }   
}
