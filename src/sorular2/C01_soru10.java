package sorular2;

import java.util.Scanner;

public class C01_soru10 {
    public static void main(String[] args) {
      /*  Soru 10-)  Klasik Soru :
        Kullanıcıdan kilosunu ve boyunu isteyin ve kütleyi hesaplayan bir program yazın

                **indeks Hesaplama: İPUCU : Vücut Kitle İndeksi = Ağırlık (kg) / Boy uzunluğunun karesi (m) // If konusunu hatırlayın!***
                Kullanıcıya aşağıdaki gibi mesaj verin:

        Eğer VKİ 18.5'ten az ise --> zayıfsınız
        Eğer VKİ 18.5 ile 25 arasında ise --> kilo idealdir
        Eğer VKİ 25 ila 30 arasındaysa --> şişmansınız
        VKİ 30'a eşit veya daha fazlaysa --> obez

        ÖRNEK :

        Ağırlık : 71
        Yükseklik : 1,72

        ÇIKTI :

        VKİ değeriniz : 23.99945916711736 Kilonuz ideal (edited)
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen boyunuzu ve kilonuzu girin\nboy:");
        double boy=scan.nextDouble();
        System.out.println("kilo:");
        double kilo=scan.nextDouble();
        double vki=kilo/(boy*boy);
        if (vki<18.5){
            System.out.println(vki+" zayifsiniz");
        } else if (vki>=18.5&&vki<25) {
            System.out.println(vki+" kilo idealdir");
        } else if (vki>=25&&vki<30) {
            System.out.println(vki+" sismansiniz");
        }else if (vki>=30){
            System.out.println(vki+" obez");
        }


    }
}
