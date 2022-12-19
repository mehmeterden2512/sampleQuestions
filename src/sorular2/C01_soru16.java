package sorular2;

import java.util.Scanner;

public class C01_soru16 {
    public static void main(String[] args) {
        /*Soru 16-)  Kullanıcıdan en az 5 harfli bir kelime alın.
        Alınan kelimenin son 3 harfinin 2 kopyasından oluşan yeni bir String oluşturun ve konsolda yazdırın
                  Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.
                  Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
                               Loopun içerisinde StringM methodlarından  yararlanalım!

         */



            Scanner erd = new Scanner(System.in);
            System.out.println("lutfen bir kelime girin");
            String girilenKelime = erd.nextLine();

            while (girilenKelime.length()< 5) {
                System.out.println("lutfen enaz bes harfli bir kelime girin");
                girilenKelime=erd.nextLine();
            }

        System.out.println(" son 3 tekrar:"+girilenKelime + girilenKelime.substring(girilenKelime.length() - 3).repeat(2));


    }
}