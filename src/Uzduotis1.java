/*
Užduotis 1
1. Susikurkite Java projektą, susikurkite Programa.java failą (class), tame faile susikurkite main funkciją.
2. Susikurkite papildomą funkciją, kuri apskaičiuoja keturkampio namo perimetrą. Namas nėra lygių sienų (visos keturios skirtingos sienos/kraštinės). Ilgiai sienų gali būti realūs skaičiai (skaičiai su kableliu), tačiau niekada neviršys 100metrų
3. Panaudokite tą funkciją, jog apskaičiuotumėte perimetrą namo su 17.35, 18, 20,47 ir 16.37 sienomis
4. Panaudokite tą funkciją, jog apskaičiuotumėte perimetrą namo su 2, 4, 2 ir 4.1 sienomis
 */
public class Uzduotis1 {
    public static void main(String[] args) {
    }


    /**
     * Apskaičiuoja namo su skirtingom sienomis perimetrą
     * @param a pirma siena
     * @param b antra siena
     * @param c trečia siena
     * @param d ketvirta siena
     * @return
     */
    public static double namoPerimetras(double a, double b, double c, double d) {
        return a + b + c + d;
    }
}
