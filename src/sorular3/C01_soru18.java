package sorular3;

import java.util.Scanner;

public class C01_soru18 {
    public static void main(String[] args) {
                /*
                Soru 18-)
        Girilen araç hızı ve yol kilometresinden, gidilen yere varış süresini hesaplayan bir method yazalım.
        Kullanıcıya hızını ve kilometreyi soralım, bunu methoda gönderelim ve bize varış süremizi hesaplasın
        İpucu:
        yol=Hız*zaman
                 */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen hizinizi girin");
        int hiz=scan.nextInt();
        System.out.println("lutfen gideceginiz yolu(km) girin : ");
        int yol=scan.nextInt();
        varisSuresi(hiz,yol);
    }
    public static void varisSuresi(int hiz,int yolkm){
     double zaman=(double) yolkm/(double) hiz;


    System.out.println("varis süresi: " +zaman+ " saat/dk");
    }

}
