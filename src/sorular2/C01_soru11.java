package sorular2;

import java.util.Scanner;

import static java.lang.System.exit;

public class C01_soru11 {
    public static void main(String[] args) {
        /*Soru 11-) Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
                 Ad ve soyadın baş harfleri büyük olmalıdır
                 Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
                 Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
	        Ipucu: IF ile çözebilirsiniz. Baş harfleri alın gerisi zaten * işareti ;-)
        Giriş :
		     > Gandalf Grey 563245879632
            Çıktı :
		 > İsim : G****** G***
		 > CCN : **** **** 9632 (edited)

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi girin");
        String isim=scan.nextLine();
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
        System.out.println("soyiisminizi girin");
        String soyIsım=scan.nextLine();
        soyIsım=soyIsım.substring(0,1).toUpperCase()+soyIsım.substring(1).toLowerCase();
        System.out.println("kart numaaranizi girin");
        String kartNo=scan.nextLine();
        if (kartNo.length()!=16) {
            System.out.println("Geçersiz kredi kartı numarası");

        }
        else {
            String kulKartNo = kartNo.substring(0, 4) + " " + kartNo.substring(4, 8) + " " + kartNo.substring(8, 12) + " " + kartNo.substring(12, 16) + " ";


            System.out.println("isim:" + isim.substring(0, 1) + isim.replaceAll("\\w", "*") +
                    " " + soyIsım.substring(0, 1) + soyIsım.replaceAll("\\w", "*") +
                    "\nCCN:" + kulKartNo.replaceAll("\\d", "*") + kartNo.substring(12, 16));
        }
    }
}
