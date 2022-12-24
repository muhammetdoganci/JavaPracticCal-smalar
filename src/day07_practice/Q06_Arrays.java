package day07_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Q06_Arrays {

    public static void main(String[] args) {

  /*
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */

        farkiniBul();

    }

    public static void farkiniBul() {

        Scanner scan=new Scanner(System.in);
        System.out.println("array uzunlugu girin : ");
        int uzunluk = scan.nextInt();
        int arr[] = new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.println("arrayin " + (i+1) + " elemanini giriniz : "); //i--> oldugunda 0. eleman diyecek biz index degil, direk eleman sorduk

            arr[i] = scan.nextInt(); // fori den gelen indexler, bu satirda kullanici tarafindan dongu bitene kadar girilen elemanlar okunur

        }
        Arrays.sort(arr);
        System.out.println("arraydaki en buyuk eleman ile en kücük eleman arasindaki fark : " + (arr[uzunluk-1]-arr[0]));

        // odev bu soruyu math classı kullanarak cozun
    }

}
