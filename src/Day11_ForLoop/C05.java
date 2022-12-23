package Day11_ForLoop;

import java.util.Arrays;
import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {

        int sayi = 1210421352;
        int[] sonuc = adetler(sayi);
        for(int i=0; i<10; i++) {
            System.out.println(sayi+" sayısında "+sonuc[i]+" adet "+i+" var.");
        }

    }

    public static int[] adetler(int sayi) {

        int[] basamak = new int[10];
        while(sayi>0) {
            int bas = sayi%10;
            basamak[bas]++;
            sayi /= 10;
            System.out.println(Arrays.toString(basamak));
        }
        return basamak;

    }
}
