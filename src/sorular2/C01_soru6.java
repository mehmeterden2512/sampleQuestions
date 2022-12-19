package sorular2;

import java.util.Scanner;

public class C01_soru6 {
    public static void main(String[] args) {

        /*Soru 6-)  Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
                    Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
                    1 şeker = 1.5 gr
                    1 kg = 1000 gram      olarak hesaplayınç

                    Ipuclari:
·                   Önce gram cinsinden yıllık ne kadar seker kullandıgını bulun ve kiloya çevirin

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir günde ne kadar cay ictiginizi girin:");
        int cay=scan.nextInt();
        System.out.println("bir cay icin ne kadar seker kullandinizi girin:");
        int seker=scan.nextInt();
        int yillikCay=cay*365;
       double yillikSekerKg=(seker*cay*365*1.5)/1000;
        System.out.println(" bir yilda icilen cay: "+yillikCay+" bir yilda kullanilan seker kg'mi: "+yillikSekerKg);

    }
}
