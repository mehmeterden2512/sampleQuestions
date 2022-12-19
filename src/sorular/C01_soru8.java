package sorular;

public class C01_soru8 {
    public static void main(String[] args) {
/*
        * * * * * * * *
        * * * * * *
        * * * *
        *  *

 */

        for (int i =1; i <= 8; i+=2) {

            for (int j = i; j <=8; j++) {
                System.out.print("*"+ " ");
            }
            System.out.println("");
        }

        /*
            *
            * *
            * * *
            * * * *

       */

        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*"+ " ");
            }
            System.out.println("");
        }




    }
}
