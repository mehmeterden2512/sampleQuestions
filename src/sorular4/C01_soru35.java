package sorular4;

import java.util.Arrays;

public class C01_soru35 {
    public static void main(String[] args) {
        //Soru 35-)
        //Parametre olarak bir isim kabul eden ve ismi bir char Array dizisi olarak yazdıran bir method Return edin.
        //		--> toCharArray() yöntemini kullanmayın
        //Örnek:
        //		String isim:    Yakup
        //		char arr[]:     [Y,a,k,u,p]
        //İpucu: Bir method içerisinde Array oluşturun ve aldıgınız ismi methoda gönderin. Bu ismi parçalayarak, her bir harfi, Arraye yerleştirin

            String isim="Yakup";
            harflerdenIsim(isim);//[Y, a, k, u, p]

    }
    public static void harflerdenIsim(String isim){
        char[] karakter=new  char[isim.length()];

        for (int i = 0; i <karakter.length; i++) {

            karakter[i]=isim.charAt(i);
        }
        System.out.println(Arrays.toString(karakter));
    }
}
