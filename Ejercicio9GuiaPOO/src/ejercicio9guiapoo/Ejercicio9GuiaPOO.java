package ejercicio9guiapoo;

import entidad.Matematica;
import servicio.MatematicaServicio;


public class Ejercicio9GuiaPOO {

    
    public static void main(String[] args) {
        
        Matematica mat = new Matematica();
        System.out.println("Se van generar 2 numeros aleatorios");
        
        mat.setNum1(Math.random() * 10);
        System.out.println("Numero 1:" + mat.getNum1());
        mat.setNum2(Math.random() * 10);
        System.out.println("Numero 2:" + mat.getNum2());
        
        //Llamamiento de metodos
        MatematicaServicio matser = new MatematicaServicio();
        System.out.println("*************************************");
        mat = matser.devolverMayor(mat);
        
        System.out.println("*************************************");
        mat = matser.calcularPotencia(mat);
        
        System.out.println("*************************************");
        mat = matser.calcularRaiz(mat);
    }
    
}
