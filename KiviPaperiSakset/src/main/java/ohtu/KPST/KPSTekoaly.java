package ohtu.KPST;

public class KPSTekoaly extends KPSTemplate {


    @Override
    protected void vastustaja() {
        tokanSiirto=tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        if(onkoOkSiirto(ekanSiirto)){
            tekoaly.asetaSiirto(ekanSiirto);
        }
        
    }
}