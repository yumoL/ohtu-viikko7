package ohtu.KPST;

import ohtu.tuomari.Tuomari;
import java.util.Scanner;
import ohtu.tekoaly.TekoalyInterface;

public abstract class KPSTemplate {

    protected static final Scanner scanner = new Scanner(System.in);
    protected static String ekanSiirto;
    protected static String tokanSiirto;
    protected static TekoalyInterface tekoaly;

    public void pelaa() {
        Tuomari tuomari = new Tuomari();
        initialiseTekoaly();
        while (true) {
            System.out.print("Ensimmäisen pelaajan siirto: ");
            ekanSiirto = scanner.nextLine();

            vastustaja();

            if (!onkoOkSiirto(ekanSiirto) || !onkoOkSiirto(tokanSiirto)) {
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

    protected abstract void initialiseTekoaly();

    protected abstract void vastustaja();
}
