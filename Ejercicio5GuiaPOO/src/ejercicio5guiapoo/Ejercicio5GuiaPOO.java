package ejercicio5guiapoo;

import entidad.Cuenta;
import java.util.Scanner;
import servicio.CuentaServicio;

public class Ejercicio5GuiaPOO {

    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        CuentaServicio cs = new CuentaServicio();
        Cuenta c1 = cs.crearCuenta();
        
        c1 = cs.ingresar(c1);
        c1 = cs.retiro(c1);
        c1 = cs.extraccionRapida(c1);
        c1 = cs.consultarSaldo(c1);
        System.out.println(c1.toString());
        
        //Se puede hacer mas perfecto.
        
        
        
        
        
        
        
//        System.out.println("Que desea hacer?");
//        System.out.println("1-Consultar sus datos/ 2-ingresar dinero / 3-retirar dinero / 4-retirar dinero express/ 5-consutar saldo/");
//        int opcion = ingresar.nextInt();

//        switch (opcion){
//            case 1:
//                cs.consultarDatos(c1);
//                break;
//            case 2:
//                cs.ingresar(c1);
//                break;
//            case 3:
//                cs.retiro(c1);
//                break;
//            case 4:
//                cs.extraccionRapida(c1);
//                break;
//            case 5:
//                cs.consultarSaldo(c1);
//                break;
//        }
        
    }
    
}
