package sorular;

import java.util.Scanner;

public class C01_soru5 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan karenin kenar uzunluğunu alın. Aldiginiz uzunluklarla karenin alanını ve çevresini hesaplayan kodu yazın.
Ipuclari:
Google yaparak karenin alaninin ve cevresinin nasil bulundugunu ögrenin :-)
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen karenin kenar uzunlugunu girin");
        double kenar=scan.nextDouble();
        double alan=Math.pow(kenar,2);
        System.out.println("alan:"+alan);

    }
}
