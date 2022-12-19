package sorular3;

import java.util.Scanner;

public class C06_soru23 {
    public static void main(String[] args) {
        /*
                Soru 23-)
        Girdi olarak bir tamsayı kabul eden ve bu tam sayının faktöriyelini hesaplayan bir method yazın. Method bize çıktıyı döndürsün.
        Örnek:
        Girdi: 6
        Çıktı: 6!=65432*1=720
        ipucu: Aldıgınız sayıyı methoda gönderin. Methodun içinde For Loop ile faktöriyelini hesaplayın.
        ----------------------------------------------------------------------------------------------------------------------------------------------------------------

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz:");
        int sayi=scan.nextInt();
        faktoryel(sayi);
    }
    public static void faktoryel(int sayi){
        int faktoryel=1;
        System.out.print(sayi+"!=");
        for (int i = sayi; i>1; i--) {
            faktoryel*=i;
            System.out.print(i+"");

    }

        System.out.print("*1="+faktoryel);

    }
}
