package sorular4;

import java.util.Arrays;
import java.util.Scanner;

public class C01_soru32 {
    public static void main(String[] args) {
        //Soru 32-)
        //Kullanıcıdan alacagınız bilgilerle oluşturdugunuz bir Integer Array dizesini Reverse olarak (tersten) yazdırınız.
        //İpucu:  int arrReverse[] diye bir array oluşturun ve kullancıya oluşturdugunuz arrayi buna tersten assign edin...


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen element sayisi girin");
        int elementSayisi = scan.nextInt();
        Integer[] arr = new Integer[elementSayisi];
        System.out.println("lütfen eklenecek sayi girin");
        for (int i = 0; i < elementSayisi; i++) {
            arr[i] = scan.nextInt();
            if (i == elementSayisi - 1) {
                break;
            } else {
                System.out.println("Lutfen eklenecek eleman girin");
            }
        }
            Integer arrReverse[]=new Integer[elementSayisi];

        for (int i =0; i<elementSayisi ; i++) {
            arrReverse[i]=arr[(arr.length-1)-i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrReverse));


    }
}
