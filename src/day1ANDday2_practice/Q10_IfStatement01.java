package day1ANDday2_practice;

import java.util.Scanner;

public class Q10_IfStatement01 {
    /*
     * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
     * ekrana yazdiran java kodunu yaziniz.
     * INPUT : Y ,  N
     * OUTPUT : YES ; NO
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Y veya N girin");
        String harf = scan.next();

        if (harf.equalsIgnoreCase("Y")){
            System.out.println("yes");
        }else if (harf.equalsIgnoreCase("N")){
            System.out.println("no");
        }else {
            System.out.println("yanlış harf girdiniz");
        }
    }

}
