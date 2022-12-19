package sorular2;

import java.util.Scanner;

public class C01_soru14 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim isteyelim. Bu isim 3 harfli olmalıdır.
         Ardından ismin aynı karakterlere sahip olup olmadığını kontrol edelim.
        İsim aynı karakterlere sahipse konsolda "Dize yinelenen karakterlere sahip"
        değil ise konsolda "Dize benzersiz karakterlere sahip" yazdıralım.
        Ipucu:
        IF/Else veya Ternary kullanabilirsiniz. Harfleri Char ile alıp karşılaştırabilirsiniz.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println( "lütfen uc harfli bir isim girin");
        String isim=scan.nextLine();

       String sonuc=isim.charAt(0)==isim.charAt(2)?"Dize yinelenen karakterlere sahip":"Dize benzersiz karakterlere sahip";
       System.out.println(sonuc);
    }
}
