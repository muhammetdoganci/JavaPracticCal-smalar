package day3_practice;

import java.util.Scanner;

public class Q05_StringManipulastion {

    public static void main(String[] args) {


        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("İsminizi girin : ");
        String isim = scan.nextLine();
        System.out.println("Soyisminizi girin : ");
        String soyisim = scan.nextLine();

        if (isim.length()>soyisim.length()){
            System.out.println("ismini soyisminizden buyuktur");
        } else if (isim.length()==soyisim.length()) {
            System.out.println("isminiz soyisminize eşittir");
        }else {
            System.out.println("soyisminiz isminizden buyuktur");
        }

    }

}
