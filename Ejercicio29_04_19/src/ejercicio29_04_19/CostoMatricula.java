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
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        double costomatricula;  // variables
        double edad;
        double costo_final;
        double costo_tramite;
        double final_pagar;
        
        int estado;
        int cargas;
        
        String cuidad;
       
        
        costomatricula = 1330; // doy el valor original de la matricula
        
        double d_edad, d_cuidad, d_estado, d_cargo;
        
        d_edad = 0;  // dejo las variables en 0
        d_cuidad = 0;
        d_estado = 0;
        d_cargo = 0;
        
        
        System.out.println("Elija a que cuidad pertenece: (Ingrese su cuidad)"); // ingreso de la cuidad
        cuidad = entrada.nextLine();
        System.out.println("Ingrese la edad del estudiante: "); // ingreso de la edad del estudiante
        edad = entrada.nextDouble();
        System.out.println("Estado civil (Elegir 1 o 2): \n1. Soltero \n2."
                + " Casado \n"); // ingreso del estado civil
        estado = entrada.nextInt();
        System.out.println("Tiene cargas familiares? (SI o NO)\n1. SI \n2. "
                + "NO "); // ingreso si es q tiene o no cargas familiares
        cargas = entrada.nextInt();
        
        
        if (edad >= 17 && edad <= 20 ){
            d_edad = costomatricula * Descuento_cuidad.descuento_edad;  // 
            
        }
        if ((cuidad).equals("Loja") || (cuidad).equals("Zamora")){
            d_cuidad = costomatricula * Descuento_cuidad.descuento_cuidad;
            
        }
        if (estado == 1){
            d_estado = costomatricula * Descuento_cuidad.descuento_estado;
        }
        if (cargas == 1){
            d_cargo = costomatricula * Descuento_cuidad.descuento_cargas;
        }
        
        costo_final = costomatricula - (d_edad + d_cuidad + d_estado + d_cargo);
        costo_tramite = costo_final * Descuento_cuidad.tramites;
        
        final_pagar = costo_final + costo_tramite;
        
        System.out.printf("\nEl costo de la matricula a pagar es: "
                + "$ %.3f\n",final_pagar);  // se muestra el costo final a pagar por la matricula
    }
    
    
}
