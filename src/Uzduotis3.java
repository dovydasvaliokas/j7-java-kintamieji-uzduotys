/*
Užduotis 3
1. Susikurkite Java projektą, susikurkite Programa.java failą (class), tame faile susikurkite main funkciją.
2. Susikurti papildomą funkciją, kuri gauna trijų linijų ilgius ir grąžina true arba false priklausomai ar su tom trim linijomis galima sudaryti trikampį. Jog būtų galima sudaryti trikampį, tai nei viena kraštinė turi nebūti nei didesnė arba nei lygi kitų dviejų kraštinių sumai. T.y., a < b + c ir t.t. su visoms kraštinėmis.
Jūsų užduočiai if nėra būtinas, kadangi galima iš karto return naudoti. Tačiau, jei norite padaryti su if, tai jis yra realiai viskas identiška kaip ir javascript
 */
public class Uzduotis3 {
    public static void main(String[] args) {

    }

    /**
     * Funkcija patikrina ar su duotomis kraštinėmis gali būti sudarytas trikampis.
     * @param a pirma kraštinė
     * @param b antra kraštinė
     * @param c trečia kraštinė
     * @return true, jei trikampis gali susidaryti ir false, jei negali.
     */
    public static boolean arIseinaTrikampis(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a && a > 0 && b > 0 && c > 0;
    }
}
