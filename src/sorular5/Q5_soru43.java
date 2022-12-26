package sorular5;

public class Q5_soru43 {
    String renk="bugday";
    String isim="kebap";
    int sayi=5;

    public Q5_soru43() {

    }

    public static void main(String[] args) {
        //Soru 43-)
        //Biri parametreli, diğeri parametresiz 2 constructor oluşturun.
        //Bu const. kullanarak en az 2 nesne oluşturun ve konsolda bu nesnelerin özellikleri yazdırın
        //Ipucu: Constructor konusunu pratik yapalım. Nesnelerin rengini adını sayısını gönderelim sonra cagırıp konsolda yazdıralım.
       Q5_soru43  yemek=new Q5_soru43();
       Q5_soru43 yemek1=new Q5_soru43(yemek.isim, yemek.renk, yemek.sayi);
        System.out.println("yemek adi: "+yemek.isim+" yemek rengi: "+yemek.renk+" yemek sayis: "+yemek.sayi);
        //yemek adi: kebap yemek rengi: bugday yemek sayis: 5
        System.out.println("yemek1 adi "+yemek1.isim+" yemek1 rengi: "+yemek1.renk+" yemek2 sayis: "+yemek1.sayi);
       // yemek1 adi lahmacun yemek1 rengi: kahverengi yemek2 sayis: 10
    }
    Q5_soru43(String adi,String rengi,int sayisi){
        adi="lahmacun";rengi="kahverengi"; sayisi=10;

        this.isim=adi;
        this.renk=rengi;
        this.sayi=sayisi;
    }

}
