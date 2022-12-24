package day06_practice;

import java.util.Scanner;

public class Q01_WhileLoop {

    public static void main(String[] args) {

        // girilen sayının basamaklarındaki rakamları toplamını bulunuz

        Scanner scan= new Scanner(System.in);
        int sayi= scan.nextInt();

        basamakTopla(sayi);
        System.out.println(basamakTopla(sayi));
    }

    public static int basamakTopla(int sayi) {
        int toplam=0;
        while (sayi!=0){
            toplam +=sayi%10;
            sayi/=10;
        }



        return toplam;
    }
}
