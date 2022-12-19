package sorular;

public class C01_soru1 {
    public static void main(String[] args) {
                /*Soru 1-)   SOUT/SYSO
        Dairenin alanini ve cevresini hesaplayan java kodu yaziniz.
        Ipuclari:
        * r=7;
        * Pi=3.14
        * Dairenin Cevresi : 2*Pi*r
        * Dairenin Alani : Pi*r*r  (edited)

                 */
        double piSayisi=3.14;
        int yariCap=7;
        double alan=piSayisi*Math.pow(yariCap,2);//Math.pow görmedik ama arastirip yaptım:)
        double cevre=piSayisi*2*yariCap;

    }
}
