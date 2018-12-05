
package ohtu.kivipaperisakset;

import ohtu.KPST.KPSParempiTekoaly;
import ohtu.KPST.KPSPelaajaVsPelaaja;
import ohtu.KPST.KPSTekoaly;
import ohtu.KPST.KPSTemplate;

public class PeliTehdas {
    
    public static KPSTemplate luoKaksinpeli(){
        return new KPSPelaajaVsPelaaja();
    }
    
    public static KPSTemplate luoYksinpeli(){
        return new KPSTekoaly();
    }
    
    public static KPSTemplate luoVaikeaYksinpeli(){
        return new KPSParempiTekoaly();
    }
}
