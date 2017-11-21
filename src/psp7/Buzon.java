
package psp7;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Buzon {
    
    String entrada="";
    
    
    
    public Buzon(){
        
    }
    
    
    
    public synchronized void escribirLer(Boolean aux){
        
     
      
        if(aux){
           
              
            while(entrada.length()==0){
                
                try {
                      System.out.println("Buzón lleno");
                    wait();
                  
                } catch (InterruptedException ex) {
                    Logger.getLogger(Buzon.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            System.out.println("leer mensaxe :"+entrada);
            entrada="";
            notify();
        }else{
            
            
            
         
            while(entrada.length()>0){
               
              
                try {
                    System.out.println("Buzón vacío, escribindo mensaxe...");
                    wait();
                    
                   
                  
                } catch (InterruptedException ex) {
                    Logger.getLogger(Buzon.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
         entrada = "Esto es un mensaje";
         notify();
        }
        
        
        
    }
    
    
    
}
