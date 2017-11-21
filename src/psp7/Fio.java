
package psp7;


import java.util.logging.Level;
import java.util.logging.Logger;


public class Fio extends Thread{
   
   Buzon bz;
   Boolean aux;
    public Fio(Buzon bz,Boolean aux){
        this.bz =bz;
        this.aux = aux;
        
        
        
    }
    public void run(){
        
        for(int i =0;i<5;i++){
            
            bz.escribirLer(aux);
            
            try {
                sleep(800);
            } catch (InterruptedException ex) {
                Logger.getLogger(Fio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
