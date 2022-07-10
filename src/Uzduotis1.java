/*
Užduotis 1
1. Susikurkite Java projektą, susikurkite Programa.java failą (class), tame faile susikurkite main funkciją.
2. Susikurkite papildomą funkciją, kuri apskaičiuoja keturkampio namo perimetrą. Namas nėra lygių sienų (visos keturios skirtingos sienos/kraštinės). Ilgiai sienų gali būti realūs skaičiai (skaičiai su kableliu), tačiau niekada neviršys 100metrų
3. Panaudokite tą funkciją, jog apskaičiuotumėte perimetrą namo su 17.35, 18, 20,47 ir 16.37 sienomis
4. Panaudokite tą funkciją, jog apskaičiuotumėte perimetrą namo su 2, 4, 2 ir 4.1 sienomis
 */
public class Uzduotis1 {
    public static void main(String[] args) {
        // 3 punktas
        System.out.println("namoPerimetras(17.35, 18, 20.47, 16.37) = " + namoPerimetras(17.35, 18, 20.47, 16.37));

        // 4 punktas
        double siena1 = 2;
        double siena2 = 4;
        double siena3 = 4;
        double siena4 = 4.1;
        double namoSienuPerimetras = namoPerimetras(siena1, siena2, siena3, siena4);
        System.out.println("namoSienuPerimetras = " + namoSienuPerimetras);
    }


    /**
     * Apskaičiuoja namo su skirtingom sienomis perimetrą
     * @param a pirma siena
     * @param b antra siena
     * @param c trečia siena
     * @param d ketvirta siena
     * @return visų sienų sumą (perimetrą)
     */
    public static double namoPerimetras(double a, double b, double c, double d) {
        return a + b + c + d;
    }
}
