package sorular;

import java.util.Scanner;

public class C01_soru3 {
    public static void main(String[] args) {
                /*SCANNER
        Kullanicidan 5 tane sayi alin,alinan bu sayilarin ortalamasini hesaplayan java kodunu yaziniz.
        Ipuclari:
        * Sayilarin ortalamasi: toplam/5 (edited)

         */

        Scanner scan=new Scanner(System.in);
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
        double sayi3=scan.nextDouble();
        double sayi4=scan.nextDouble();
        double sayi5=scan.nextDouble();

        double ortalama=(sayi1+sayi2+sayi3+sayi4+sayi5/5);
        System.out.println(ortalama);

    }
}
