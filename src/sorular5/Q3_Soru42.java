package sorular5;

public class Q3_Soru42 {
    public static void main(String[] args) {
        //Soru 42-)
        //Parametre olarak birden fazla tamsayı (integer) kabul eden ve bu integer sayıların toplamını yazdıran bir dönüş methodu (void) yazın
        //Method name=sum
        //eğer metodu bu şekilde çağırırsanız
        //
        //     toplam(1,2,3) çıktı =6
        //	 toplam(1,2,3,4,5) çıktı =15
        //	 sum(1,2) output=3
        //Ipucu:  varargs sorusu, varargs olusturalım
        //Soru 42-)
        topla(1,2,3);
        topla(1,2,3,4,5);

    }

    public static void  topla(int... sayilar) {

        int toplam=0;
        for (int each:sayilar
             ) {
            toplam+=each;
        }
        System.out.println("sayilar toplami= "+toplam);
    }
    Q3_Soru42(int... sayilar){
       topla(sayilar);
    }
}
