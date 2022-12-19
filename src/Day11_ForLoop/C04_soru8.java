package Day11_ForLoop;

import java.util.Scanner;

public class C04_soru8 {
    //Soru 8 (interview)- Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum
    //tamsayilari yazdirin, sira
    //- 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
    //- 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
    //- hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz
    //yazdirin
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayi girin");
        int sayi = scan.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(" fizBuzz ");
            } else if (i % 3 == 0) {
                System.out.print(" fizz ");
            } else if (i%5 == 0) {
                System.out.print(" buzz ");
            } else {
                System.out.print(i + " ");
            }


        }
        System.out.println("");
        //Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.
        Scanner erd=new Scanner(System.in);
        System.out.println( "lutfen tersten yazdirmak istediginiz metin girin");
        String metin=erd.nextLine();
        String tersMetin="";


        for (int i =metin.length()-1; i >=0; i--) {

            tersMetin+=metin.substring(i,i+1);
        }

        System.out.println(tersMetin);

    }
}