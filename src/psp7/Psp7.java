
package psp7;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Psp7 {

    
    public static void main(String[] args) {
       Buzon bz = new Buzon();
       Fio f1 = new Fio(bz,true);
       Fio f2 = new Fio(bz,false);
      // Fio f3 = new Fio(bz,false);
       //Fio f4 = new Fio(bz,true);
       f2.start();
        try {
            f2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Psp7.class.getName()).log(Level.SEVERE, null, ex);
        }
       f1.start();
       
       
      // f3.start();
       //f4.start();
       
      
      
    }
    
}
