package sorular4;

import java.util.Scanner;

public class C01_soru28 {


    public static void main(String[] args) {
        //Soru-28)
        //Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
        //Örnek:
        //      Sayı: 1238
        //      Sayının Tersi: 8321
        //İpucu:  Loop kullanabilirsiniz.
        Scanner scan=new Scanner(System.in);
        System.out.println(" Lutfen bir sayi giriniz ");
        int sayi=scan.nextInt();
        //sayi Stringe dondur:

        String sayiString=String.valueOf(sayi);
        String tersSayi="";
        for (int i =sayiString.length()-1; i >=0 ; i--) {
            tersSayi+=sayiString.charAt(i);
        }
        System.out.println(tersSayi);


    }
}
