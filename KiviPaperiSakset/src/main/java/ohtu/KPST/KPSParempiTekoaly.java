package ohtu.KPST;

// Kivi-Paperi-Sakset, jossa voidaan valita pelataanko vastustajaa
import ohtu.tekoaly.TekoalyParannettu;

public class KPSParempiTekoaly extends KPSTemplate {

    @Override
    protected void vastustaja() {
        tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        if (onkoOkSiirto(ekanSiirto)) {
            tekoaly.asetaSiirto(ekanSiirto);
        }

    }

    @Override
    protected void initialiseTekoaly() {
        tekoaly = new TekoalyParannettu(20);
    }
}
