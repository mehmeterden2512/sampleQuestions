package sorular;

import java.util.Scanner;

public class C01_soru4  {
    public static void main(String[] args) {
              /*  Kullanıcıdan bir sayı alın ve aldiginiz bu
               sayının küpünün yarısını konsola yazdırin.
                Ipuclari:
         Sayinin küpü: sayi*sayi*sayi (edited)
          */

        Scanner sayi=new Scanner(System.in);
        System.out.println("lütfen bir sayi girin");
         double girilenSayi=sayi.nextDouble();
         double sayiKup=girilenSayi*girilenSayi*girilenSayi;
        System.out.println(sayiKup/2);


    }
}
