/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 16/09/2021
 */

public class ArrayEksempler {

    public static void main(String[] args) {
        System.out.println("Eksempler på arrays");

        // Man kan med fordel trække arrayets størrelse ud i en variabel
        final int SIZE = 8;

        // Erklærere jeg et array
        int[] skoStørrelser = new int[SIZE];

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

        int størrelse = 40;
        for (int i = 0; i < SIZE; i++) {
            // KONKATENERING - Concatenation
            // System.out.println("Arrayets " + i + ". element indeholder værdien " + skoStørrelser[i]);
            System.out.println(skoStørrelser[i] + " personer har størrelse " + størrelse++);
        }


        double[] values = new double[SIZE];

    }
}
