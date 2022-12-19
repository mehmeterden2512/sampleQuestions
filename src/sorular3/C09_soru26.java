package sorular3;

import java.util.Scanner;

public class C09_soru26 {
    public static void main(String[] args) {
       /* Soru 26-)
        Sayının Mükemmel sayı olup olmadığını kontrol eden kodu yazalım.
                NOT:  Kendisi hariç, pozitif bölenlerinin toplamı o sayıya eşitse, bu tür sayılar Mükemmel Sayı olabilir.
                Örnek:
        Giriş :6
        Çıkış: 6 Mükemmel Sayıdır
        Giriş :7
        Çıkış:7 Mükemmel Sayı Değildir
        ipucu: For Loop kullanarak ve belki biraz da if else yardımı ile bu soruyu çözebilirsiniz

        */
        Scanner scan=new Scanner(System.in);
        System.out.println("sayi giriniz:");
        int sayi=scan.nextInt();
        int pztfBolenlerToplami=0;

        for (int i = 1; i <sayi ; i++) {
            if (sayi%i==0){
                pztfBolenlerToplami+=i;
            }
        }
        if (sayi==pztfBolenlerToplami){
            System.out.println(sayi+" sayisi mükemmel bir sayidir.");
        }else{
            System.out.println(sayi+" sayisi mükemmel bir sayi degildir.");
        }

    }
}
