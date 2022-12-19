package sorular3;

import java.util.Scanner;

 /*
                Kullanıcıdan doğum tarihini alınız. Burcunu hesaplayan bir method yazınız.
        ipucu:
        Switch Case kullanabilirsiniz. Veya Method yazarak Method aracılıgı ile de yapabilirsiniz.
                 */
        /*
        Burçların Tarihleri ve Özellikleri
                - Koç Burcu (21 Mart- 20 Nisan)
            - Boğa Burcu (21 Nisan- 20 Mayıs)
            - İkizler Burcu (21 Mayıs- 21 Haziran)
            - Yengeç Burcu (22 Haziran- 22 Temmuz)
            - Aslan Burcu (23 Temmuz- 22 Ağustos)
            - Başak Burcu (23 Ağustos- 22 Eylül)
            - Terazi Burcu (23 Eylül- 23 Ekim)
            - Akrep Burcu (24 Ekim- 22 Kasım)
            - Yay Burcu (23 Kasım- 21 Aralık)
            - Oğlak Burcu (22 Aralık- 20 Ocak)
            - Kova Burcu (21 Ocak- 18 Şubat)
            - Balık Burcu (20 Şubat- 20 Mart)
         */


public class C02_soru19 {
    public static void main(String[] args) {
            //soru19:
        String dogumTarihi = "";
        boolean tarihFormatiDogruMu = false;
        int gun = 0;
        String ay = "";
        String[] ayListesi = {"ocak", "subat", "mart", "nisan", "mayis", "haziran", "temmuz", "agustos", "eylul", "ekim", "kasim", "aralik"};
        int listeUzunlugu = ayListesi.length;

        // once gun girilmis mi ve arada bosluk var mı kontrolu yapilir
        do {
            Scanner st = new Scanner(System.in);
            System.out.println("lutfen dogum tarihi giriniz: Örnek: 15 ocak");
            dogumTarihi = st.nextLine();
            String arr[] = dogumTarihi.split(" ");

            try {

                ay = arr[1].toLowerCase();
                for (int i = 0; i < listeUzunlugu; i++) {
                    if (ay.equals(ayListesi[i])) {//aylarin ismi dogru girdimi?
                        tarihFormatiDogruMu = true;
                        break;
                    }
                }
                if (!tarihFormatiDogruMu) {
                    System.out.println(" hatalı ay girisi, tekrar giriniz");
                }
                gun = Integer.parseInt(arr[0]);
                if (!(1 <= gun && gun <= 31)) {
                    System.out.println(" hatalı gun girisi, tekrar giriniz");
                    tarihFormatiDogruMu = false;
                }

            } catch (Exception hataMesaji) {
                System.out.println("hatalı tarih format girisi");
            }
        }
        while (!tarihFormatiDogruMu);
        burcumNe(gun, ay);

    }

    public static void burcumNe(int gun, String ay) {

        switch (ay) {
            case "mart":
                if (gun < 21)
                    System.out.println("burcunuz : balik");
                else System.out.println("burcunuz : koç");
                break;
            case "nisan":
                if (gun < 21)
                    System.out.println("burcunuz : koç");
                else System.out.println("burcunuz : boğa");
                break;
            case "mayis":
                if (gun < 21)
                    System.out.println("burcunuz : boğa");
                else System.out.println("burcunuz : ikizler");
                break;
            case "haziran":
                if (gun < 21)
                    System.out.println("burcunuz : ikizler");
                else System.out.println("burcunuz : yengec");
                break;
            case "temmuz":
                if (gun < 21)
                    System.out.println("burcunuz : yengec");
                else System.out.println("burcunuz : aslan");
                break;
            case "agustos":
                if (gun < 21)
                    System.out.println("burcunuz : aslan");
                else System.out.println("burcunuz : basak");
                break;
            case "eylul":
                if (gun < 21)
                    System.out.println("burcunuz : basak");
                else System.out.println("burcunuz : terazi");
                break;
            case "ekim":
                if (gun < 21)
                    System.out.println("burcunuz : terazi");
                else System.out.println("burcunuz : akrep");
                break;
            case "kasim":
                if (gun < 21)
                    System.out.println("burcunuz : akrep");
                else System.out.println("burcunuz : yay");
                break;
            case "aralik":
                if (gun < 21)
                    System.out.println("burcunuz : yay");
                else System.out.println("burcunuz : oglak");
                break;
            case "ocak":
                if (gun < 21)
                    System.out.println("burcunuz : oglak");
                else System.out.println("burcunuz : kova");
                break;
            case "subat":
                if (gun < 18)
                    System.out.println("burcunuz :kova");
                else System.out.println("burcunuz :balik");
                break;
            default:
                System.out.println("hatalı ay ismi girisi");
        }
    }
}

