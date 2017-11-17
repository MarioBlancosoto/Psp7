
package psp7;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Buzon {
    
    String entrada="";
    
    
    
    public Buzon(){
        
    }
    
    
    
    public synchronized void escribirLer(Boolean aux){
        
     
      
        if(aux){
           entrada = " MErda";
            System.out.println("Escribindo mensaxe");
            System.out.println("Enviando...");
            notify();
            
        }else{
            entrada="";
            System.out.println("leendo mensaxe"); 
            
            
            while(entrada.length()>0){
                System.out.println("leendo mensaxe "+entrada);
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
