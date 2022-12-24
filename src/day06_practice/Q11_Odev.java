package day06_practice;

import java.util.Scanner;

public class Q11_Odev {

    public static void main(String[] args) {

        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

        String pin= "mehmet.1234";
        int girisHakkı=3;

        Scanner scan=new Scanner(System.in);
        System.out.println("******HOŞHELDİNİZ******");

        while (true){
            System.out.println("pın kodunuzu girin : ");
            String girilenPın= scan.nextLine();

            if (pin.equals(girilenPın)){
                System.out.println("basarili giris yaptiniz");
                break;
            }else {
                System.out.println("yanlıs giris yaptiniz...ç");
                girisHakkı--;
                System.out.println("kalan giris hakkı : " + girisHakkı);
            }
            if (girisHakkı==0){
                System.out.println("giris hakkiniz kalmadi..bloklandiniz..");
                break;
            }
        }
    }
}
