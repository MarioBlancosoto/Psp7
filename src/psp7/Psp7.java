
package psp7;


public class Psp7 {

    
    public static void main(String[] args) {
       Buzon bz = new Buzon();
       Fio f1 = new Fio(bz,true);
       Fio f2 = new Fio(bz,false);
       
       f1.start();
       f2.start();
      
      
    }
    
}
