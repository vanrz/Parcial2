/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculador;

/**
 *
 * @author Estudiantes
 */
abstract public class Calculador implements lCalculador {

    
    
    Punto punto1= new Punto();
    Punto punto2= new Punto();
    
    
     @Override
    public double calcularDistancia() {
        
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularArea() {
        int dx=(punto2.getX()-punto1.getX())*punto1.getY();
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularPendiente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   }
    
    
        
        
        
        
        
        // TODO code application logic here
    
    

