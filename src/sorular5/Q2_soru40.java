package sorular5;

public class Q2_soru40 {
    public static void main(String[] args) {
        //Soru-40)
        //Bir diziyi (Array) parametre olarak kabul eden ve dizideki tüm elemanların toplamını döndüren bir
        // method yazın ve ardından sonucu main methodda yazdırın.
        //Örn:
        //girdi : {1,2,3,4,5,6,7,8}
        //çıkış: 36
        //ıpucu: For Loop ile arrayin elemanlarını toplayın ve methodu yazdırarak döndürün
        //Soru-40)
        int[] sayilar = {1, 2, 3, 4, 5, 6, 7, 8};
        topla(sayilar);//sayilar toplami= 36
    }

    private static void topla(int[] sayilar) {

        int toplam = 0;
        for (int each : sayilar
        ) {
            toplam += each;
        }
        System.out.println("sayilar toplami= " + toplam);

    }
}
