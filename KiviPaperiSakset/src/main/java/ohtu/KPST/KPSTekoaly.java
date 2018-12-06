package ohtu.KPST;

import ohtu.tekoaly.Tekoaly;

public class KPSTekoaly extends KPSTemplate {


    @Override
    protected void vastustaja() {
        tokanSiirto=tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        if(onkoOkSiirto(ekanSiirto)){
            tekoaly.asetaSiirto(ekanSiirto);
        }
        
    }

    @Override
    protected void initialiseTekoaly() {
        tekoaly=new Tekoaly();
    }
}