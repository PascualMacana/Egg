package ejercicio7guiapoo;

import entidad.Persona;


public class Ejercicio7GuiaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //instanciacion de objetos, en este caso la info va a entrar por teclado
        
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();
      
        //Persona 1
        System.out.println("Persona 1");
        p1.crearPersona();
        p1.calcularIMC();
        p1.esMayorDeEdad();
        
        //Persona 2
        System.out.println("Persona 2");
        p2.crearPersona();
        p2.calcularIMC();
        p2.esMayorDeEdad();
        
        //Persona 3
        System.out.println("Persona 3");
        p3.crearPersona();
        p3.calcularIMC();
        p3.esMayorDeEdad();
        
        //Persona 4
        System.out.println("Persona 4");
        p4.crearPersona();
        p4.calcularIMC();
        p4.esMayorDeEdad();
        
        imcT(p1, p2, p3, p4);
        edades(p1, p2, p3, p4);
        
    }
    //Metodo para calcular el porcentaje de personas por arriba del imc o por debajo.
    public static void imcT(Persona p1, Persona p2, Persona p3, Persona p4){
        int a = 0;
        int b = 0;
        int c = 0;
        double imcp1 = (p1.getPeso() / Math.pow(p1.getAltura(), 2));
        double imcp2 = (p2.getPeso() / Math.pow(p2.getAltura(), 2));
        double imcp3 = (p3.getPeso() / Math.pow(p3.getAltura(), 2));
        double imcp4 = (p4.getPeso() / Math.pow(p4.getAltura(), 2));
        
        double[] vectorImc = {imcp1, imcp2, imcp3, imcp4};
        System.out.println(vectorImc[0]);
        for (int i = 0; i < vectorImc.length; i++) {
            if (vectorImc[i] < 20){
                a++;
            } else if (vectorImc[i] >= 20 && vectorImc[i] <= 25){
                b++;
            }else{
                c++;
            }
        }
        System.out.println("Hay " + (a*100)/4 + " % de personas debajo del imc recomendado");
        System.out.println("Hay " + (b*100)/4 + " % de personas en el imc recomendado");
        System.out.println("Hay " + (c*100)/4 + " % de personas por arriba del imc recomendado");
    }
    
    public static void edades(Persona p1, Persona p2, Persona p3, Persona p4){
        int[] vectorEdad = {p1.getEdad(), p2.getEdad(), p3.getEdad(), p4.getEdad()};
        int edadMayor = 0;
        int edadMenor = 0;
        for (int i = 0; i < vectorEdad.length; i++) {
            if (vectorEdad[i] >= 18) {
                edadMayor++;
            }else{
                edadMenor++;
            }
        }
        
        System.out.println("Hay " + edadMayor + " personas mayores de edad");
        System.out.println("Hay " + edadMenor + " personas menores de edad");
    }

}
