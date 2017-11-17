
package psp7;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Buzon {
    
    String entrada;
    
    
    
    public Buzon(){
        
    }
    
    
    
    public synchronized void escribirLer(String entrada){
       
      
        if(entrada==""){
            
            System.out.println("mensaje enviado");
            notify();
            
        }else{
            
            System.out.println("leendo mensaxe"); 
            
            
            while(entrada.length()>0){
                try {
                    System.out.println("Buzón cheo,esperando...");
                    wait();
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(Buzon.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        
        
    }
    
    
    
}
