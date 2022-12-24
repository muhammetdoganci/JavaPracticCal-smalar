package day3_practice;

import java.util.Scanner;

public class Q02_StringManipwithMethodCreation {


    public static void main(String[] args) {

        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir string girin");
        String str = scan.nextLine().toLowerCase();

        System.out.println(xvzVarmi(str));

        System.out.println("bir kelime girin");
        String str2 = scan.nextLine();

        dgnVarMi(str2);
        System.out.println("girilen kelime de dgn var mi : \n" + dgnVarMi(str2));
    }

    public static boolean dgnVarMi(String str2) {
        if (str2.contains("dgn")){
            return true;
        }else
            return false;
    }

    private static boolean xvzVarmi(String str) {

        if (str.contains("xyz")){
            return true;
        }else
            return false;



    }
}
