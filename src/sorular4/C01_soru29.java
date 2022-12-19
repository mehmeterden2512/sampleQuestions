package sorular4;

public class C01_soru29 {
    public static void main(String[] args) {
        //Soru29-)
        //1'den 100'e kadar olan doğal sayıların toplamını bulmak için bir Program yazın.
        //İpucu: Loop kulanabilirsiniz

        int baslangic=1;
        int bitis=100;
        int toplam=0;

        for (int i = 1; i <=100 ; i++) {
            toplam+=i;
        }
        System.out.println(toplam);//5050



    }
}
