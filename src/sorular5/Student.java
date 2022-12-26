package sorular5;

import java.util.Scanner;

public class Student {
    //Soru 45-)
    // (ad soyad yas cınsiyet okul) Ardından Student adlı bir class olusturun ve içine parametreli constructor koyun,
    // bu parametreler Maın classdaki bılgılerı ıstesın.
    //Bu parametreli constructor icinde kullanıcıya ögrenci bilgilerini doldurtun. Ardından consolda giriilen bilgileri yazdırın
        String ad;
        String soyad;
        int yas;
        char cinsiyet;
        String okul;

    public Student() {
    }

    Student(String ad, String soyad, int yas , char cinsiyet, String okul){
            this.ad=ad;
            this.soyad=soyad;
            this.yas=yas;
            this.cinsiyet=cinsiyet;
            this.okul=okul;
        Scanner scan=new Scanner(System.in);
        System.out.println("ad?");
        ad=scan.nextLine();
        System.out.println("soyad?");
        soyad=scan.nextLine();
        System.out.println("yas?");
        yas=scan.nextInt();
        System.out.println("cinsiyet?");
        cinsiyet=scan.next().charAt(0);
        System.out.println("okul: ");
        okul=scan.nextLine();
        System.out.println("ad: "+ad+" soyadı: "+soyad+" yas: "+yas+" cinsiyet: "+cinsiyet+" okul adı: "+okul);

    }

    @Override
    public String toString() {
        return "Student{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                ", cinsiyet=" + cinsiyet +
                ", okul='" + okul + '\'' +
                '}';
    }
}
