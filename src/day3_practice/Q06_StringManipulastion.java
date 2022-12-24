package day3_practice;

import java.util.Scanner;

public class Q06_StringManipulastion {

    public static void main(String[] args) {


        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
        // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir kelime veya cümle girin");
        String str = scan.nextLine();
        int bosluk = str.indexOf(" ");
        if ((bosluk == -1 && !str.isEmpty())) {
            System.out.println("bosluk yoktur");
        } else {
            System.out.println("bosluk vardir");
        }
    }

}
