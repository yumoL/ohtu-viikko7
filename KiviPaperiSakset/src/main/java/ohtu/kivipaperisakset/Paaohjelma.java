package ohtu.kivipaperisakset;

import ohtu.KPST.KPSTekoaly;
import ohtu.KPST.KPSPelaajaVsPelaaja;
import ohtu.KPST.KPSParempiTekoaly;
import java.util.Scanner;

public class Paaohjelma {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String poistoMuistus = "peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s";

        while (true) {
            System.out.println("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan "
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetataan");

            String vastaus = scanner.nextLine();

            if (vastaus.endsWith("a")) {
                System.out.println(poistoMuistus);
                PeliTehdas.luoKaksinpeli().pelaa();
            } else if (vastaus.endsWith("b")) {
                System.out.println(poistoMuistus);
                PeliTehdas.luoYksinpeli().pelaa();
            } else if (vastaus.endsWith("c")) {
                System.out.println(poistoMuistus);
                PeliTehdas.luoVaikeaYksinpeli().pelaa();
            } else {
                break;
            }

        }

    }
}
