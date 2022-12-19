package sorular2;

import java.util.Scanner;

public class C01_soru8 {
    public static void main(String[] args) {
        /*
        Soru-8)  Kullanicidan üc basamaklı bir sayı alin.
                 Kullanicidan alinan bu sayinin basamaklari toplamini ekranda yazdirin.
                ipuclari:
                Matematiksel Islemler konusuna bakalim. Bölme islemi kullanarak sayinin basamaklarini
                alalim ve toplam adli bir konteynira (Variable) atalim. (edited)
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 100 ile 1000 arasinda 3 basamakli bir sayi girin:");
        int sayi=scan.nextInt();
        int basamakToplami=0;
        int birlerBasamagi=0;
        birlerBasamagi+=sayi%10;
        basamakToplami+=birlerBasamagi;
        sayi/=10;
       birlerBasamagi=sayi%10;
       basamakToplami+=birlerBasamagi;
       sayi/=10;
       birlerBasamagi=sayi%10;
       basamakToplami+=birlerBasamagi;
        System.out.println(basamakToplami);



    }
}
