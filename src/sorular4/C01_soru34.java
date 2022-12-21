package sorular4;

import java.util.ArrayList;
import java.util.List;

public class C01_soru34 {
    public static void main(String[] args) {
        //Soru 34-)
        //Bir String'i parametre olarak kabul eden ve verilen dizede Stringde bulunan rakamların toplamını yazdıran bir Method yazın.
        //
        //Örnek
        //String str : ade1r6d5
        //Int toplam : 8
        //İpucu :      Character.isDigit() kullanarak Digitleri alabilir sonra bunları Arraye atabilirsiniz.
        //                  Ardından loop yardımı ile Integer.valueOf() kullanarak toplama yapabilirsiniz

        String str =" ade1r4d6";

        StringdeRakamlarTopla(str);

    }
    public static void StringdeRakamlarTopla(String str){

        int toplam=0;


        for (int i = 0; i <str.length() ; i++) {
                   if (Character.isDigit(str.charAt(i))){
                      toplam+=Integer.parseInt(String.valueOf(str.charAt(i)));
                   }
        }

        System.out.println(toplam);
    }
}
