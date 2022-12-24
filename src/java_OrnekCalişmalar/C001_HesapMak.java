package java_OrnekCalişmalar;

import java.util.Scanner;

public class C001_HesapMak {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sonuc=0;
        int dongu=0;
        //System.out.println("Lütfen bir sayı giriniz.");
        //double sayi1 = scan.nextDouble();

        for (int i = dongu; i<20; i++) {
            System.out.println("Lütfen "+(dongu+1)+". sayı giriniz.");
            double sayi = scan.nextDouble();
            System.out.println("Lütfen bir işlem giriniz.");
            char islem = scan.next().charAt(0);
            sonuc+=sayi;

            if (islem =='+'||islem =='-'||islem =='*'||islem =='/') {
                if (islem == '+') {sonuc+=sayi;}
                else if (islem == '-') {sonuc-=sayi;}
                else if (islem == '*') {sonuc*=sayi;}
                else if (islem == '/') {sonuc/=sayi;}
                else System.out.println("lütfen + - * / den birini girin.");
                sonuc+=sayi;
                dongu ++;}
            else if (islem =='=') {
                System.out.println(sonuc);
                break;
            }else {
                System.out.println("işleminiz tamamlandi");
            }




        }
    }

}
