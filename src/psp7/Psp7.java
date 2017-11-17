
package psp7;


public class Psp7 {

    
    public static void main(String[] args) {
       Buzon bz = new Buzon();
       Fio f1 = new Fio(bz,"");
       Fio f2 = new Fio(bz,"sada");
       
       f1.start();
       f2.start();
      
    }
    
}
