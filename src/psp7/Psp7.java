
package psp7;


public class Psp7 {

    
    public static void main(String[] args) {
       Buzon bz = new Buzon();
       Fio f1 = new Fio(bz,true);
       Fio f2 = new Fio(bz,false);
       Fio f3 = new Fio(bz,false);
       Fio f4 = new Fio(bz,true);
       f1.start();
       f2.start();
       f3.start();
       f4.start();
       
      
      
    }
    
}
