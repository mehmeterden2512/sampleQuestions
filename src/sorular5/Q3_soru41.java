package sorular5;

import java.util.Arrays;

public class Q3_soru41 {
    public static void main(String[] args) {
        //Soru 41-)
        //Parametre olarak 2 Int Array kabul eden ve 2 Array listesini yeni bir Arraye ekleyen ve yazdıran bir method yazın.
        //		 * Input1={1,2,3,4}
        //		 * Input2={5,6}
        //		 * Çıktı={1,2,3,4,5,6}
        //Soru 41-)
        int[] sayialr1={1,2,3,4};
        int[] sayilar2={5,6};

        arrayleriBirlestir(sayialr1,sayilar2);

    }

    private static void arrayleriBirlestir(int[] sayialr1, int[] sayilar2) {

        int[] birlemisYeniArray=new int[sayialr1.length+sayilar2.length];

        for (int i = 0; i <sayialr1.length ; i++) {
            birlemisYeniArray[i]=sayialr1[i];
        }
        for (int i =0; i <sayilar2.length ; i++) {
            birlemisYeniArray[sayialr1.length+i]=sayilar2[i];
        }
        System.out.println(Arrays.toString(birlemisYeniArray));
    }
}
