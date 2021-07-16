/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprograma;
 import java.util.Scanner;
/**
 *
 * @author USUARIOTC
 */
public class Primerprograma {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Cambio_moneda();
    }
    public  static void Cambio_moneda()
    {
        Scanner datos = new Scanner(System.in);
        String nombre;
        double cantidad;
        double dolar=0.13;
        double euros=0.11;
        double yuanes=0.83;
        int opcion;
        
        System.out.print("Ingrese nombre: ");
        nombre = datos.nextLine();
        
        System.out.print("Ingrese cantidad: ");
        cantidad  = datos.nextDouble();
        
        System.out.println("Ingrese opcion para hacer el cambio de moneda:"
                + "\n1. Quetzales a dolares"
                + "\n2. Quetzales a euros"
                + "\n3. Qetzales a yuanes ");
        opcion = datos.nextInt();
        double resultado;
        switch(opcion)
        {
            case 1:
                System.out.print("--------------------------------------------");
                resultado = cantidad * dolar;
                System.out.println("\n"+nombre + ""
                + "\nSu cambio es de $" + resultado);
                System.out.print("--------------------------------------------");
                break;
            case 2:
                resultado = cantidad * euros;
                System.out.print("--------------------------------------------");
                System.out.println("\n"+nombre + ""
                + "\nSu cambio es de €" + resultado);
                System.out.print("--------------------------------------------");
                break;
            case 3:
                System.out.print("--------------------------------------------");
                resultado = cantidad * yuanes;
                System.out.println("\n"+nombre + ""
                + "\nSu cambio es de ¥" + resultado);
                System.out.print("--------------------------------------------");
                break;
            default:
                System.out.println("Lo sentimos has seleccionado una opcion invalida" 
                        + "\nVuelve a intentar...");
                break;
        }
    }
    
}
