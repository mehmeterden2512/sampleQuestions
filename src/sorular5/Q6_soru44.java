package sorular5;

import java.util.Scanner;

public class Q6_soru44 {
    public static void main(String[] args) {
        //Soru 44-)
        //Main methodda ögrenci bilgileri oluşturun ve bu verileri kullanın.
        //Changename adında bir method oluşturun, parametre olarak öğrenci bilgileri alın
        // ve methodda tüm bilgileri değiştirin ve yeni bilgileri ekleyip yazdırın.
        //Main Methoddaki Rename methodunu çağırdığımız satırda öğrenci bilgilerini tekrardan yazdırın
        //Changesurname adlı bir method oluşturun , bu method lastname'i parametre olarak alsın.
        // Methodda kullanıcıya yeni bir lastname sorulsun ve eski lastname degiştirilsin.
        //Soru 44-)
        String ogrenciIsmi = "Mehmet";
        String soyismi = "Erden";
        Changename(ogrenciIsmi, soyismi);
        System.out.println(" ogrenci bilgileri: " + ogrenciIsmi + " " + soyismi);
        soyismi = Chansurname(soyismi);
    }
    private static String Chansurname(String lastname) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" lutfen almak istedginiz soyisimi girin? ");
        String yeniSoyisim = scan.nextLine();
        lastname = yeniSoyisim;
        return lastname;
    }
    private static void Changename(String ogrenciIsmi, String soyismi) {
        ogrenciIsmi = "Ali";
        soyismi = "Topuksuz";
        System.out.print("ogrenci bilgiler: " + ogrenciIsmi + " " + soyismi);
    }
}
