package day1ANDday2_practice;

import java.util.Scanner;

public class Q09_Scanner02 {
    // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
    // ve yasadiklari yeri seviyorlarsa
    // bu bilgiyi yazdirin

    // next() only can read the first word
    // nextLine() can read the whole line
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Adinizi girin : ");
        String ad = scan.nextLine();
        System.out.println("Memleketinizi girin : ");
        String memleket = scan.nextLine();
        System.out.println("Konumunuzu girin : ");
        String konum = scan.nextLine();
        System.out.println("Yaşınızı girin : ");
        int yas = scan.nextInt();
        System.out.println("Boyunuzu girin : ");
        double boy = scan.nextDouble();
        System.out.println("yasadığın yeri seviyor musun? : ");
        boolean seviyorMu= true;
        System.out.println(seviyorMu);
    }





}
