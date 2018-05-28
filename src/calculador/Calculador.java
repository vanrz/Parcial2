/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculador;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author Estudiantes
 */
public class Calculador implements lCalculador {

    
    
    Punto punto1= new Punto();
    Punto punto2= new Punto();
    
    
     @Override
    public double calcularDistancia() {
        double a=0;
        
        a = sqrt(pow(punto2.getY()-punto1.getY() ,2) + pow(punto2.getX()-punto1.getX(),2));
        
        return a;
        
        
        
    }

    @Override
    public double calcularArea() {
        double c=0;
        double d=0;
        c = (punto1.getY()*punto1.getX());
        d =((punto2.getY()-punto1.getY())*(punto2.getX()-punto1.getX()));
        return c+(d/2);
        
    }

    @Override
    public double calcularPendiente() {
       double p=0;
        p = (punto2.getY() - punto1.getY()/punto2.getX() - punto1.getX());
        return p;
    }
    
   }
    
    
        
        
        
        
        
        // TODO code application logic here
    
    

