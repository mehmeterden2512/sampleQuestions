package Day11_ForLoop;

import java.util.Random;
import java.util.Scanner;

public class ZarSorusu {
    static Scanner scan = new Scanner(System.in);
    static Random zarAtisi = new Random();
    static int tutulan1;
    static int tutulan2;
    static int tutulan3;
    static int atis1;
    static int atis2;
    static int atis3;
    static int tutulanToplami;
    static int zarAtisToplami;

    public static void main(String[] args) {
        //kullanicidan uc tane sayi alin 1 ile 3 arasinda sonra uc kere zar attirin kullanicin kazanmasi
        // icin attigi sayilarin toplami  tuttugu sayilarin toplamindan kucuk olmasi gerekir

        int oyunHakki = 10;
        int oynanEl = 0;


        do {
            System.out.println("lütfen üc sayi tutunuz 1-ile 6 arasında Sansiniz hala devam ediyor ");

            System.out.println("1.sayi:");
            tutulan1 = scan.nextInt();
            if (tutulan1 < 0 || tutulan1 > 6) {
                System.out.println("kural ihlali degerler dısında sayi girilemez ");
                System.out.println("1.sayi:");
                tutulan1 = scan.nextInt();
            }
            System.out.println("2.sayi:");
            tutulan2 = scan.nextInt();
            if (tutulan2 < 0 || tutulan2 > 6) {
                System.out.println("kural ihlali degerler dısında sayi girilemez ");
                System.out.println("2.sayi:");
                tutulan2 = scan.nextInt();
            }
            System.out.println("3.sayi:");
            tutulan3 = scan.nextInt();
            if (tutulan3 < 0 || tutulan3 > 6) {
                System.out.println("kural ihlali degerler dısında sayi girilemez ");
                System.out.println("3.sayi:");
                tutulan3 = scan.nextInt();
            }

            atis1 = zarAtisi.nextInt(6) + 1;
            atis2 = zarAtisi.nextInt(6) + 1;
            atis3 = zarAtisi.nextInt(6) + 1;
            tutulanToplami = tutulan1 + tutulan2 + tutulan3;
            zarAtisToplami = atis1 + atis2 + atis3;

            oynanEl++;

            if (oynanEl >= 10) {
                System.out.println("oyun bitti malesef kazanamadiniz");
                break;
            }

        } while (zarAtisToplami > tutulanToplami);

        System.out.println("tutulan sayi toplami: " + tutulanToplami + " zar atıs toplami: " + zarAtisToplami +
                "\ntebrikler " + oynanEl + " oyun sonunda kazandiniz ");


        System.out.println("1.atıs: " + atis1 + " 2.atıs: " + atis2 + " 3.atıs: " + atis3);

    }


}
