
package psp7;


import java.util.logging.Level;
import java.util.logging.Logger;


public class Fio extends Thread{
   
   Buzon bz;
   String entrada;
    public Fio(Buzon bz,String entrada){
        this.bz =bz;
        
        this.entrada =entrada;
        
        
        
    }
    public void run(){
        
        for(int i =0;i<20;i++){
            
            bz.escribirLer(entrada);
            
            try {
                sleep(800);
            } catch (InterruptedException ex) {
                Logger.getLogger(Fio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
