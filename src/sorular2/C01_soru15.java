package sorular2;

import java.util.Scanner;

    public class C01_soru15 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 2 isim/kelime alın: isim1 ve isim2
        -> isim1 çift sayıda karaktere sahipse, ikinci kelimeyi ilk kelimenin ortasına ekleyin
        -> ilk sözcükte tek sayılar varsa,  'isim2, isim1'e eklenemez" ifadesini yazdırın.
        Ipucu: If Else ve String Manipulation konusunu hatırlayalım!  Substring,concat,lengt...
        Örn:
             isim1= masa
                 isim2= ali
             Konsol => maalisa
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen birinci ismi girin");
        String isim1=scan.nextLine();
        System.out.println("lutfen 2. ismi girin");
        String isim2=scan.nextLine();
        if (isim1.length()%2==0){
            String sonuc1=isim1.substring(0,isim1.length()/2)+isim2+isim1.substring(isim1.length()/2);
            System.out.println(sonuc1);
        } else
            System.out.println("isim2, isim1'e eklenemez");


    }
}
