package day1ANDday2_practice;

import java.util.Scanner;

public class Q08_Scanner01 {
    // kullanicidan 2 tam sayi alin
    // bu tam sayilari toplayin ve sonucu yazdirin
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("1. tam sayiyi girin");
        int sayi1 = scan.nextInt();
        System.out.println("2. tam sayiyi girin");
        int sayi2 = scan.nextInt();
        int topla = sayi1+sayi2;
        System.out.println("iki tamsayinin topami : " + topla);


    }

}
