package sorular4;

import java.util.Arrays;

public class C01_soru36 {
    public static void main(String[] args) {
        //Soru 36-)
        //Verilen bir Array dizisindeki ortadaki degeri döndüren bir kod/method yazın.
        // ( Yapabilirseniz Dinamik kod yazmaya çalışın, Arrayin uzunlugu degişse de ortadaki elemanı getirsin)
        //Örnek:
        //inputarr[]=   {1,2,3,4,5,6,7}
        //output:         4
        //İpucu:  Arrayin indexini hesaplayarak bulabilirsiniz.
        // Kendinizi geliştirme adına sorunun cevabını degişik yollardan yapabilir,
        // Arrayi kullanıcıya oluşturabilirsiniz (Öneri..)

      int  arr[]=   {1,2,3,4,5,6,7,8,10};
        System.out.println(arr.length);
        System.out.println(ortadakiDeger(arr));
    }public static int ortadakiDeger(int[] arr){
        int ortadakiDeger=0;
      if (arr.length%2!=0){
          ortadakiDeger=(arr.length+1)/2;
      }
      return ortadakiDeger;
    }

}
