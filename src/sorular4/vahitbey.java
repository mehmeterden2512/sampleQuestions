package sorular4;

import java.util.Arrays;

public class vahitbey {
    public static void main(String[] args) {
        String str = "Kodlama harika.";
        String[] krktr = str.split("");
        System.out.println(Arrays.toString(krktr));
        System.out.println(krktr[krktr.length-1]);
        String[] tersKrktr = new String[krktr.length];


        for (int i = 0; i <tersKrktr.length; i++) {

                tersKrktr[i]=krktr[(krktr.length-1)-i];

        }
        System.out.println(Arrays.toString(tersKrktr));

    }
}
