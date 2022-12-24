package day5_practice;

import java.util.Scanner;

public class Q04_MetCreationForLoop {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir string giriniz : ");
        String str= scan.nextLine();

        System.out.println("stringin tersi : "+ reverseString(str));
    }

    private static String reverseString(String str) {
        String reversed= "";
        for (int i = str.length()-1; i >=0 ; i--) {

            reversed+=str.charAt(i);
            
        }

        return reversed;
    }
}
