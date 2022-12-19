package sorular4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_soru30 {
    public static void main(String[] args) {
        //Soru 30-)
        //Bir Stringdeki yinelenen karakterleri Array String olarak döndüren bir kod yazın.
        //( mülakat sorusu )
        //Örnek:
        //String str="Javacokkolay"
        //Yinelenen karakterler : [a, o, k]
        //İpucu: İçiçe for looplar, String Manupulations ve ifler kullanrak çözebilrsiniz.
        //            Stringdeki bir harfi Stringde bulunan diger harfler ile karşılaştırıpkonteynıra atacaksınız
        //            bu yüzden iç içe loop kullanmak mantıklı duruyor

        String str = "Javacokkolay";
        String[] strArray=str.split("");
       List<String> yinelenenKarakterler=new ArrayList<>();
        for (int i = 0; i <strArray.length; i++) {
                if (str.indexOf(i)!=str.lastIndexOf(i)){
                    yinelenenKarakterler.add(i,strArray[i]);
                }
        }
        System.out.println(yinelenenKarakterler);





    }
}
