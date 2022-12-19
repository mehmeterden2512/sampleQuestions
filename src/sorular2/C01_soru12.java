package sorular2;

public class C01_soru12 {
    public static void main(String[] args) {
       /*Verilen iki sayının toplamını -sıfırdan büyük veya eşit olabilir- hesaplamak ve yazdırmak için bir program oluşturalım
        Eğer verilen tamsayıların veya toplamın 10'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım

        Ipucu:  IF/Else kullanabilirsiniz.
                Örnek:
        İki tamsayı girin:
        25  veya  4567986321453
        46   veya 145623
        Konsolda Çıktı :
        Sayıların toplamı: 71  veya  Fazla Yüklenme (edited)

        */

        int sayi1=1256798635;
        int sayi2=1261456232;
        int toplam=sayi1+sayi2;
        String sayi1String=Integer.toString(sayi1);
        String sayi2String=Integer.toString(sayi2);
        String toplamString=Integer.toString(toplam);

        if (sayi1String.length()>10||sayi2String.length()>10||toplamString.length()>10){
            System.out.println("fazla yüklenme");
        }else{
            System.out.println(toplam);
        }
    }
}
