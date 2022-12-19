package sorular3;

import java.util.ArrayList;
import java.util.Scanner;

public class C05_soru22 {
    public static void main(String[] args) {
      /*  Soru 22-)
        Kullanıcıdan 2 tamsayı girmesini isteyin, ardından GCD (En Büyük Ortak Bölen) ve LCM'yi bulun (En Küçük Ortak Kat)
        Giriş :
        30 ve 40

        Beklenen Çıktı:
        30 ve 40 için EBOB= 10
        30 ve 40 için EKOK= 120
        ipucu:
        Loopları kullanarak çözebiliriz. İki sayının EKOK'u sayıların çarpımının sayıların EBOB'una bölünerek bulunabilir.

       */
        Scanner st=new Scanner(System.in);
        System.out.println("lutfen ilk tam sayi giriniz:");
        int sayi1=st.nextInt();
        System.out.println("ikinci tam sayi giriniz");
        int sayi2=st.nextInt();
        int ebob=1;
        int ekok;
        for (int i =1; i <=sayi1&&i<=sayi2; i++) {
            if (sayi1%i==0&&sayi2%i==0){
                ebob=i;
            }
        }
        ekok=sayi1*sayi2/ebob;
        System.out.println(sayi1+" ve "+sayi2+" icin EBOB= "+ebob+"\n"+sayi1+" ve "+sayi2+" icin EKOK= "+ekok);

    }
}
