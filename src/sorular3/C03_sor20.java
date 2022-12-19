package sorular3;

import java.util.Arrays;
import java.util.Scanner;

public class C03_sor20 {
    public static void main(String[] args) {
        /*
        Soru 20-)
        Kullanıcıdan bir isim yazmasını isteyin, İsim uzunluğu 3 olmalıdır.
         Daha sonra ismin aynı karakterlere sahip olup olmadığını kontrol edin.
        Dize aynı karakterlere sahipse:  "Dizede yinelenen karakterler var" ;
         aynı karakterlere sahip degilse  "String benzersiz karakterlere sahip"
        yazdırın. İsim 3 karakterden uzunsa "Bu kadar uzun cümleyi anlayamam ben agam" yazdırın.

                        Örnek:
                        giriş: ama
                    çıkış: Dizede yinelenen karakterler var

                            İpucu: İf Else ve Char kullanarak çözebiliriz.

 */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen  uc harfli bir isim girin");
        String isim =scan.nextLine();
        if (isim.length()==3){
                char ilkHarf=isim.charAt(0);
                char ucuncuHarf=isim.charAt(2);
                if (ilkHarf==ucuncuHarf){
                    System.out.println("Dizede yinelenen karakterler var");
                }else{
                System.out.println("String benzersiz karakterlere sahip");
            }

        } else  {
            System.out.println("Bu kadar uzun cümleyi anlayamam ben agam");
        }

    }
}
