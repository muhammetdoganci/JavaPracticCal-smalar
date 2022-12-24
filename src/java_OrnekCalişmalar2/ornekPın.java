package java_OrnekCalişmalar2;

import java.util.Scanner;

public class ornekPın {

    public static void main(String[] args) {

        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

        String pin = "Atike.1234";
        int girisHakki=3;
        String pukKodu="365214";
        int pukGirisHakki=2;

        Scanner scan=new Scanner(System.in);
        System.out.println("Hoş Geldiniz");

        while (true) {
            System.out.println("Pın kodunuzu girin : ");
            String girilenPın = scan.nextLine();
            if (pin.equals(girilenPın)) {
                System.out.println("giris basarili");
                break;
            } else {
                System.out.println("yanliş giris yaptiniz tekrar giriniz " + (girisHakki - 1) + " hakkiniz kaldı");
                girisHakki--;

            }
            if (girisHakki == 1) {
                System.out.println("son giris hakkin ona gore");

            }
            if (girisHakki == 0) {
                System.out.println("pın kodunuz bloke oldu geçmis olsun puk kodu gir");
                //break;

                String girilenPukKodu = scan.nextLine();
                if (pukKodu.equals(girilenPukKodu)) {
                    System.out.println("Giris basarili pın kodunuzu tekrar girin");
                    if (pin.equals(girilenPın)) {
                        System.out.println("giris basarili");
                        break;
                    }/* else if(!pukKodu.equals(girilenPukKodu)){
                    System.out.println("yanlık puk kodu" + (pukGirisHakki-1) + " hakkiniz kaldi");
                    pukGirisHakki--;
                }else if (pukGirisHakki==0){
                    System.out.println("telefonunuz kapaniyor");
                    break;
                }
                }
                */

                }

            }
        }




    }
}
