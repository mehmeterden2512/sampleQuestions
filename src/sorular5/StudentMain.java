package sorular5;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        //StudentMaın adında bir class olusturun, ögrenci bilgilerini alın.
        // (ad soyad yas cınsiyet okul)
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen adinizi girin");
        String ad=scan.nextLine();
        System.out.println("soyadınız girin");
        String soyad=scan.nextLine();
        System.out.println("yasiniz?");
        int yas=scan.nextInt();
        System.out.println("Cinsiyet? girin E/K");
        char cinsiyet=scan.next().charAt(0);
        System.out.println("okul adi girin ");
        String okul=scan.next();

        Student ogrenci=new Student(ad,soyad,yas,cinsiyet,okul);
        System.out.println(ogrenci);
    }
}
