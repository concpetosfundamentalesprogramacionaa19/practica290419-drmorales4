/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio29_04_19;

import java.util.Scanner;
import descuentos.*; // importando

/**
 *
 * @author drmorales4
 */
public class CostoMatricula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double costomatricula;  // declaro variables
        double costo_final;
        double costo_tramite;
        double final_pagar;
        
        int estado;
        int cargas;
        int edad;
        
        String cuidad;
       
       
        
        System.out.println("Elija a que cuidad pertenece: (Ingrese su cuidad)"); // ingreso de la cuidad
        cuidad = entrada.nextLine();
        
        System.out.println("Ingrese la edad del estudiante: "); // ingreso de la edad del estudiante
        edad = entrada.nextInt();
        
        System.out.println("Estado civil (Elegir 1, 2 o 3): \n1. Soltero \n2."
                + " Casado \n3. Otros"); // ingreso del estado civil
        estado = entrada.nextInt();
        
        System.out.println("Tiene cargas familiares? (SI o NO)\n1. SI \n2. "
                + "NO "); // ingreso si es que tiene o no cargas familiares
        cargas = entrada.nextInt();
        
        costomatricula = 1330; // doy el valor original de la matricula
        
        if ((cuidad).equals("Loja") || (cuidad).equals("Zamora")){
            costomatricula = costomatricula - Descuento_cuidad.descuento_cuidad; // resto del costo de la matricula el desucuento por cuidad
            
        }
        if (edad >= 17 && edad < 20 ){
            costomatricula = costomatricula - Descuento_cuidad.descuento_edad;  // resto del costo de la matricula el desucuento por la edad
           
            
        }
        if (estado == 2){
            costomatricula = costomatricula - Descuento_cuidad.descuento_estado; // resto del costo de la matricula el desucuento por el estado civil casado
           
            
        }
        if (cargas == 1){
            costomatricula = costomatricula - Descuento_cuidad.descuento_cargas; // resto del costo de la matricula el desucuento por las cargas familiares
            
        }
        
        costo_tramite = costomatricula * Descuento_cuidad.tramites; // hago el calculo del incremento del 2% por tramites
        final_pagar = costomatricula + costo_tramite;  // calculo el valor final a pagar por la matricula, sumando el valor ya hecho los descuentos mas el valor adicional del tramite
        
        System.out.printf("\nEl costo de la matricula a pagar es: "
                + "$ %.3f\n",final_pagar);  // se muestra el costo final a pagar por la matricula
    }
    
    
}
