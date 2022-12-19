package Day11_ForLoop;

import java.util.Scanner;

public class C03_soru5 {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        //hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 20 den kucuk bir sayi giriniz");
        int  sayi=scan.nextInt();
        int faktoryel=1;
        String acıklama="";
        for (int i = sayi; i >=1 ; i--) {
            faktoryel*=i;
            System.out.print(i+"*");
        }
        System.out.println("="+faktoryel);
    }
}
