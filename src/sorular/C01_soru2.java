package sorular;

import java.util.Scanner;

public class C01_soru2 {
    public static void main(String[] args) {
                /*
                Dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz.
        Ipuclari:
        * Dikdortgenin Cevresi: 2 * (uzun kenar + kisa kenar)
        * Dikdortgenin Alani : uzun kenar * kisa kenar (edited)
                 */
        System.out.println("lütfen hesaplamak istediginiz kenar uzunluklarini giriniz \nkenarlar arasinda entar'a basin");
        Scanner scan=new Scanner(System.in);
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        double cevre=2*(kenar1+kenar2);
        System.out.println("cevre:"+cevre);
        double alan=kenar1*kenar2;
        System.out.println("alan:"+alan);

    }
}
