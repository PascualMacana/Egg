
package servicio;

import entidad.Matematica;

public class MatematicaServicio {
    Matematica mat;
    double max;
    double min;
    
    public Matematica devolverMayor(Matematica mat){
        System.out.println("Se le va a devolver el numero mayor.");
        max = Math.max(mat.getNum1(), mat.getNum2());
        System.out.println(max);
        return mat;
    }
    
    public Matematica calcularPotencia(Matematica mat){
        System.out.println("Se va a calcular la potencia del mas grande elevado al menor");
        min = Math.min(mat.getNum1(), mat.getNum2());
        
        long maxRedondeado = Math.round(max);
        long minRedondeado = Math.round(min);
        
        System.out.println(Math.pow(maxRedondeado, minRedondeado));
         return mat;
    }
    public Matematica calcularRaiz(Matematica mat){
        System.out.println("Se calculara la raiz cuadrada del menor numero");
        //Se saca el valor absoluto para que no sea un numero negativo.
        double a = Math.abs(min);
        
        System.out.println(Math.sqrt(a));
        return mat;
    }

}
