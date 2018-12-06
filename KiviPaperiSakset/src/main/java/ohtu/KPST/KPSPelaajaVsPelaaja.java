package ohtu.KPST;

public class KPSPelaajaVsPelaaja extends KPSTemplate {

    @Override
    protected void vastustaja() {
        System.out.print("Toisen pelaajan siirto: ");
        tokanSiirto = scanner.nextLine();
    }

    @Override
    protected void initialiseTekoaly() {

    }
}
