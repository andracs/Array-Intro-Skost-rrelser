import java.util.Arrays;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 16/09/2021
 */

public class ArrayEksempler {

    public static void main(String[] args) {
        System.out.println("*** Eksempler på arrays ***");

        // Man kan med fordel trække arrayets størrelse ud i en variabel
        // final bruges til at lave en KONSTANT, som ikke kan ændres senere i programmet
        final int SIZE = 8;

        // Erklærer et array og instansiere det
        int[] skoStørrelser = new int[SIZE];

        // Vi indsætter værdier i arrayet manuelt denne gang
        // 40 i sko
        skoStørrelser[0] = 1;
        // 41 i sko
        skoStørrelser[1] = 0;
        // 42 i sko
        skoStørrelser[2] = 3;
        // 43 i sko
        skoStørrelser[3] = 5;
        // 44 i sko
        skoStørrelser[4] = 4;
        // 45 i sko
        skoStørrelser[5] = 1;
        // 47 i sko
        skoStørrelser[7] = 1;

        int størrelse = 40;         // Hjælpevariabel til at kunne holde styr på de forskellige skostørrelser
        for (int i = 0; i < skoStørrelser.length; i++) {
            // Konkatenering eller concatenation betyder, at vi lægge flere tekstbider sammen til fx en sætning
            System.out.println(skoStørrelser[i] + " personer har størrelse " + størrelse++);
        }


        System.out.println("\nVariable i Java kan indeholde konkrete værdier ELLER referencer til en adresse i hukommelsen (RAM)");
        // Kopierer x'ens værdi ind i y -- eller kopierer den blot referencen? Afprøv ved at køre programmet.
        int x = 2;
        int y = x;
        System.out.println("Y's oprindelig værdi er " + y);
        x = 100;
        System.out.println("Y's værdi ændrer sig ikke når man ændrer x --> " + y);

        // Viser en reference til arrayets start
        System.out.println( skoStørrelser + " er en reference til skoStørrelser-arrayets placering i hukommelsen.");

        int[] skoStørrelser2;
        // Kopiere by reference - begge variabler kommer til at henvise til samme array!!!
        // skoStørrelser2 = skoStørrelser;
        // Kopiere by value - vi laver 2 forskellige arrays
        skoStørrelser2 = Arrays.copyOf(skoStørrelser, SIZE);
        System.out.println(skoStørrelser2 + " er referencen til skoStørrelser2-arrayet, som vi har KOPIERET by value.");
        skoStørrelser2[0] = 100;
        System.out.println("Oprindelige array indeholder denne værdi på index 0: " + skoStørrelser[0]);
        System.out.println("Nye array indeholder denne værdi på index 0: " + skoStørrelser2[0]);


        System.out.println("\nEksempel på søgning");
        String[] navne = {"William", "Allan", "Torben", "Marcus"};
        Arrays.sort(navne);             // Sådan sorterer du et array
        for (String navn : navne) {     // Enhanced for loop, se på https://books.trinket.io/thinkjava2/chapter7.html#sec93
            System.out.println(navn);
            if (navn.equals("Marcus")) System.out.println("Marcus er fundet!"); // Eksempel på søgning
        }   

    }
}
