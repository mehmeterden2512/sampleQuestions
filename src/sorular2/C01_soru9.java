package sorular2;

import java.util.Scanner;

public class C01_soru9 {
    public static void main(String[] args) {
        //Soru 9-)  Girilen zamanı saniyeye çeviriniz.
        //               Örnek: 2 saat 3 dakika 10 saniye ==>	 7390 saniye
        //         Ipucu:
        //         Saati alıp saniyeye cevirebilirsiniz.
        //         Kullanıcıdan ayrı ayrı alabilirsiniz veya
        //         kullanıcıdan hepsini birlikte alabilirsiniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen saat giriniz\nsaat:");
        int saat=scan.nextInt();
        System.out.println("lutfen dakika giriniz\ndakika:");
        int dakika=scan.nextInt();
        System.out.println("lutfen saniye giriniz\nsaniye:");
        int saniye=scan.nextInt();
        System.out.println("sonuc: "+(60*(saat+dakika+saniye))+" saniye");






    }
}
