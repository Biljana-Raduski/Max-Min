public class MaxiMinVrednostNiza {
    public static void main(String[] args) {

        int[] niz = {5, 7, 3, 6, 9, 4, 1}; //Ovde sam deklarisala i inicijalizovala neki niz

        int max = niz[0]; //Ovde je inicijalizovana promenljiva "max" sa pozicijom [0] - pocetnom pozicijom u nizu
        int min = niz[0]; //Ovde je inicijalizovana promenljiva "min" sa pozicijom [0] - pocetnom pozicijom u nizu

        for (int i = 0; i < niz.length; i++) { //Ovde je inicijalizovana promenljiva "i" sa pocetnom vrednosti 0, postavljen uslov da dok je "i" manji od niza "i" se povecava za 1
            if (niz[i] > max) { //Kada "i" dostigne maksimalnu vrednost iz niza,
                max = niz[i]; //promenljivoj "max" se dodeljuje maksimalna vrednost iz niza, tacnije ovde se deklarise
            }
            if (niz[i] < min) { //Kada "i" dostigne minimalnu vrednost iz niza,
                min = niz[i]; //promenljivoj "min" se dodeljuje minimalna vrednost iz niza, kao i "max" ovde se deklarise
            }
        }
        System.out.println("Maksimalna vrednost niza je " + max);
        System.out.println("minimalna vrednost niza je " + min);
       //Krajnji postupak, ispisujem tekst kao i trazene vrednosti.

    }
}