package day3_practice;

import java.util.Scanner;

public class Q04_StringManipulastion {

    public static void main(String[] args) {

        /*
        Kullanicidan bir kelime girmesini isteyin.
        * Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
        * kelimenin ortasindaki karakteri yazdirin.
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime girin");
        String kelime= scan.next();

        char ortancaKrk=kelime.charAt(kelime.length()/2);

        if (kelime.length()%2==1 && kelime.length()>=3){
            System.out.println("ortanca karakter : " +ortancaKrk);
        }else {
            System.out.println("harf sayisi tek olan kelime girin");
        }


    }

}
