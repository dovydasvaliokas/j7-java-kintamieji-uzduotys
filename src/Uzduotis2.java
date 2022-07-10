/*
Užduotis 2
1. Susikurkite Java projektą, susikurkite Programa.java failą (class), tame faile susikurkite main funkciją.
2. Susikurkite papildomą funkciją, kuri gauna visas tris trikampio kraštines ir apskaičiuoja (returnina) perimetrą.
3. Susikurkite papildomą funkciją, kuri gauna visas tris trikampio kraštines ir naudojant Herono formulę apskaičiuoja bet kokio trikampio plotą. (Herono formulei reikalingas perimetras, dėl to jo funkciją ir pasidarėte antrame punkte). Herono formulė:
   Pasitikrinti galima: https://www.calculator.net/triangle-calculator.html
 */
public class Uzduotis2 {
    public static void main(String[] args) {
        System.out.println("trikampioPerimetras(5, 6, 8) = " + trikampioPerimetras(5, 6, 8));
        System.out.println("trikampioPlotas(5, 6, 8) = " + trikampioPlotas(5, 6, 8));

    }

    /**
     * Apskaičiuoja trikampio perimetrą
     * @param a pirma kraštinė
     * @param b antra kraštinė
     * @param c trečia kraštinė
     * @return double perimetrą
     */
    public static double trikampioPerimetras(double a, double b, double c) {
        return a + b + c;
    }

    /**
     * Apskaičiuoja trikampio plotą naudojant Herono formulę.
     * Pirma funkcija apskaičiuoja perimetrą, naudojant Herono formulę (https://lt.wikibooks.org/wiki/Herono_formul%C4%97)
     * Kadangi formulėje naudojamas pusperimetris, tai funkcijos viduje susikūriau papildomą kintamąjį, jog būtų paprasčiau.
     * @param a pirma kraštinė
     * @param b antra kraštinė
     * @param c trečia kraštinė
     * @return
     */
    public static double trikampioPlotas(double a, double b, double c) {
        double p = trikampioPerimetras(a, b, c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
