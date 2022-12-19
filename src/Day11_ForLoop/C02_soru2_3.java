package Day11_ForLoop;

import java.util.Scanner;

public class C02_soru2_3 {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen baslangic ve bitis degerlerini girin");
        int basDeg = scan.nextInt();
        int bitDeg = scan.nextInt();
        int toplam = 0;

        if (basDeg > 0 && bitDeg > 0) {
            if (bitDeg < basDeg) {
                System.out.println("baslangic degeri bitis degerinden kucuk olmali");
            } else {
                for (int i = basDeg; i <= bitDeg; i++) {

                    toplam += i;

                }
                System.out.print(basDeg + " ile " + bitDeg + " sayilari arasindaki sayilar toplami: " + toplam);
            }
        } else {
            System.out.println("degerleri pozitif giriniz");
        }
        System.out.println("");
        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        //hesaplayin
        int input = 5;


        int faktoryel = 1;
        for (int i = input; i >= 1; i--) {

            faktoryel *= i;

        }
        System.out.println(input + "!:" +faktoryel );
    }
}
