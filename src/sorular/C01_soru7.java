package sorular;

import java.util.Scanner;

public class C01_soru7 {
    public static void main(String[] args) {
        //Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        int sayi=scan.nextInt();

        String sayi1=Integer.toString(sayi);
        int uzunluk=sayi1.length();
        int rakamlarToplami=0;

        for (int i = 0; i <uzunluk ; i++) {
            rakamlarToplami+=sayi%10;
            sayi/=10;
        }

        System.out.println(rakamlarToplami);
    }
}
