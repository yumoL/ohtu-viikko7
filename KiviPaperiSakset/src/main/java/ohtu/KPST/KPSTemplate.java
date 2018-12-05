
package ohtu.KPST;

import ohtu.tuomari.Tuomari;
import ohtu.tekoaly.Tekoaly;
import ohtu.tekoaly.TekoalyParannettu;
import java.util.Scanner;

public abstract class KPSTemplate {
    protected static final Scanner scanner=new Scanner(System.in);
    protected static String ekanSiirto;
    protected static String tokanSiirto;
    protected static Tekoaly tekoaly=new Tekoaly();
    protected static TekoalyParannettu tekoalyParempi=new TekoalyParannettu(20);
    
    
    public void pelaa(){
        Tuomari tuomari = new Tuomari();
        while (true) {
            System.out.print("Ensimmäisen pelaajan siirto: ");
            ekanSiirto = scanner.nextLine();
            
            vastustaja();
 
            if(!onkoOkSiirto(ekanSiirto)||!onkoOkSiirto(tokanSiirto)){
                break;
            }
            
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);

        }

        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
        
    }
    
    protected static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
    
    protected abstract void vastustaja();
}
