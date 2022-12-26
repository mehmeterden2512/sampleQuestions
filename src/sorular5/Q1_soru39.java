package sorular5;

import java.util.Arrays;

public class Q1_soru39 {
    public static void main(String[] args) {
        //Soru-39)
        //Bir tamsayı dizisini (Int Array) girdi olarak kabul eden ve verilen bu (Arrayden) diziden minimum ve
        // maksimum sayıları yazdıran bir yöntem yazın
        //Örnek:
        //Input : {3,2,5,4,1,6}
        //Output :
        //min: 1
        //max: 6
        //Ipucu: sort yöntemni kullanabilirsiniz.
        //Soru-39)
        System.out.println("****cozum1****");
        int[] sayilar = {3, 2, 5, 4, 1, 6};
        Arrays.sort(sayilar);
        System.out.println("minumum deger= " + sayilar[0] + "\nmax deger= " + sayilar[sayilar.length - 1]);
        System.out.println("****cozum2******");
        sayilar = new int[]{3, 2, 5, 4, 1, 6};
        int min = sayilar[0];
        int max = sayilar[0];
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] < min) {
                min = sayilar[i];
            }
            if (sayilar[i] > max) {
                max = sayilar[i];
            }
        }
        System.out.println("min= " + min + "\nmax=" + max);

    }
}
