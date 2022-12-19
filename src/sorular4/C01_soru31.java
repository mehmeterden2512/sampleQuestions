package sorular4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C01_soru31 {
    public static void main(String[] args) {
        //Soru 31-)
        //Kullanıcıdan Arrayin uzunlugunu isteyin.
        //Ardından kullanıcıdan Arrayin elemanlarını girmesini isteyin.
        //İpucu:  Önce uzunluk alıp arrayi oluştur daha sonra loop ile kullancııya doldurt
        //------------------------------------------------------------------------------------------------------------------
        Scanner scan=new Scanner(System.in);
        System.out.println("olusturmak istedginiz array'in uzunlugunu giriniz");
        int uzunluk=scan.nextInt();

        String[] elemanlar=new String[uzunluk];
        System.out.println("eklemek istedginiz elementi giriniz");
        String eleman=scan.nextLine();
        for (int i = 0; i <uzunluk ; i++) {

                elemanlar[i]= eleman=scan.nextLine();
            System.out.println("eklemek istedginiz elementi giriniz");

        }
        System.out.println(Arrays.toString(elemanlar));


    }
}
