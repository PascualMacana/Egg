package Servicios;

import Entidad.Libro;
import java.util.Scanner;


public class LibroServicio {
    
    //Metodo con el objeto a devolver(Libro), seguido por el nombre del metodo (infoLibro)
    public Libro infoLibro(){
    
        //instanciar un objeto
        Libro l1 = new Libro();
        
        //empezar a pedir informacion del libro
        Scanner ingresar = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el ISBN del libro");
        l1.setISBN(ingresar.nextInt());
        
        System.out.println("Ingrese el titulo");
        l1.setTitulo(ingresar.next());
        
        System.out.println("Ingrese el autor");
        l1.setAutor(ingresar.next());
        
        System.out.println("Ingrese el numero de paginas");
        l1.setPaginas(ingresar.nextInt());
        
        return l1;
    }
    
}
