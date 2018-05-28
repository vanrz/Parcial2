/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculador;

import java.util.Scanner;

/**
 *
 * @author estudiantes
 */
public class Principal {
    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calculador calculador=new Calculador();
        
        Scanner scann=new Scanner(System.in);
       
        System.out.println("Ingrese X del punto 1: ");
        calculador.punto1.setX(scann.nextInt());
        System.out.println("Ingrese Y el punto 1: ");
        calculador.punto1.setY(scann.nextInt());
         
        System.out.println("Ingrese X del punto 2:  ");
        calculador.punto2.setX(scann.nextInt());
        System.out.println("Ingrese Y del punto 2: ");
        calculador.punto2.setY(scann.nextInt());
        
        System.out.println("Distancia entre los puntos:");
        System.out.println(calculador.calcularDistancia());
        
        System.out.println("Area bajo el segemento de la recta definida por los puntos ingresados: ");
        System.out.println(calculador.calcularArea());
        
        System.out.println("Pendiente del segmento de la recta definida entre los puntos ingresados:");
        System.out.println(calculador.calcularPendiente());


         
        
    }
    
}
