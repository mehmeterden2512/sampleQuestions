package sorular3;

import java.util.Locale;
import java.util.Scanner;

public class C03_soru21 {
    public static void main(String[] args) {
        /*
                Soru 21-)
        Bir aydaki gün sayısını bulmak için bir Java programı yazın
        (Mülakat Sorusu / Interview Sorusu / Leak Year)

        Örnek:
        Bir ay numarası girin: 2
        Bir yıl girin: 2016

        Şubat 2016'da 29 gün vardır
        ipucu:
        Switch Case kullanarak çözebiliriz. Şubat ayı senelere göre farklılık gösterir. Bunu çözmek için Şubat ayı için method kullanmamız gerekiyor!
        Artık yıl ile ilgili olarak NOT düşeyim değerli arkadaşlar!
        ipucu2:
        ARTIK YILI BULABİLMENİZ İÇİN İKİ KOŞULU GÖZ ÖNÜNDE BULUNDURUN!:
        1-) Bir yılın son iki rakamı "00" değilse ve bu sayı 4 e tam bölünebiliyorsa bu yıl artık yıldır.
        Mesela 2008 yılı artık yıldır. Son iki rakamı "00" değildir ve 4 e bölünebilen bir sayıdır.
        2-) Bir yılın son iki rakamı "00" ise ve bu sayı 400 e tam bölünüyorsa, yine bu yıl yine artık yıldır.
        Mesela 2000 yılı artık yıldır.Son iki rakamı "00" ve 400 e bölünebilen bir sayıdır.
                 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun sayısını bulmak istedginiz ay numarasi girin:");
        int ayNo = scan.nextInt();
        System.out.println("bir yil girin");
        int yil = scan.nextInt();
        boolean yilSonuc = artikYilMi(yil);
        if (ayNo != 2) {
            switch (ayNo) {
                case 1:
                    System.out.println("ocak gün sayis:31");
                    break;
                case 3:
                    System.out.println("Mart gün sayis:31");
                case 4:
                    System.out.println("nisan gün sayis:30");
                    break;
                case 5:
                    System.out.println("mayis gün sayis:31");
                    break;
                case 6:
                    System.out.println("Haziran gün sayis:30");
                    break;
                case 7:
                    System.out.println("Temmuz gün sayis:31");
                    break;
                case 8:
                    System.out.println("Agustos gün sayis:31");
                    break;
                case 9:
                    System.out.println("Eylül gün sayis:30");
                    break;
                case 10:
                    System.out.println("Ekim gün sayis:31");
                    break;
                case 11:
                    System.out.println("Kasim gün sayis:30");
                    break;
                case 12:
                    System.out.println("Aralik gün sayis:31");
                    break;
                default:
                    System.out.println("hatali ay girisi");
            }
        //subay ayi icin ayri degerlendirme:
        } else if (ayNo == 2) {
            System.out.println(yilSonuc ? "Subat gun sayisi:29" : "Subat gun sayisi:28");

        } else {
            System.out.println("hatali aynumara girisi");
        }
    }

    public static boolean artikYilMi(int yil) {
        /*ARTIK YILI BULABİLMENİZ İÇİN İKİ KOŞULU GÖZ ÖNÜNDE BULUNDURUN!:
        1-) Bir yılın son iki rakamı "00" değilse ve bu sayı 4 e tam bölünebiliyorsa bu yıl artık yıldır.
                Mesela 2008 yılı artık yıldır. Son iki rakamı "00" değildir ve 4 e bölünebilen bir sayıdır.
        2-) Bir yılın son iki rakamı "00" ise ve bu sayı 400 e tam bölünüyorsa, yine bu yıl yine artık yıldır.
                Mesela 2000 yılı artık yıldır.Son iki rakamı "00" ve 400 e bölünebilen bir sayıdır.*/
        boolean artikYil = true;
        if (yil % 4 == 0 && yil % 100 != 0) {
            return artikYil;
        } else if (yil % 100 == 0 && yil % 400 == 0) {
            return artikYil;
        } else
            return artikYil = false;

    }
}