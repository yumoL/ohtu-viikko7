package ohtu.KPST;

// Kivi-Paperi-Sakset, jossa voidaan valita pelataanko vastustajaa
public class KPSParempiTekoaly extends KPSTemplate {

    @Override
    protected void vastustaja() {
        tokanSiirto = tekoalyParempi.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        if (onkoOkSiirto(ekanSiirto)) {
            tekoalyParempi.asetaSiirto(ekanSiirto);
        }

    }
}
