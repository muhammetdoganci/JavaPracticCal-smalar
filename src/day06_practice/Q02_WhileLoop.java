package day06_practice;

import java.util.Scanner;

public class Q02_WhileLoop {

    public static void main(String[] args) {

         /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil(tek ise)
        */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sayi girin : ");
        int sayi= scan.nextInt();


        int count=0;
        while (sayi>0){
            if (sayi%2==1){
                System.out.println(sayi);
                count++;
            }
            sayi--;

        }
        System.out.println("count : " + count);

    }
}
