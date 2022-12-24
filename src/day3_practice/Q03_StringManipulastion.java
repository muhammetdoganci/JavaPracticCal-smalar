package day3_practice;

import java.util.Scanner;

public class Q03_StringManipulastion {

    public static void main(String[] args) {

           /*
         name1 ve name2 degiskenlerini olusturun.
         name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
         name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirin.
          e.g:
         name1= mehmet
         name2= ahmet
         Print ==> mehahmetmet
          */

        String name1= "mehmet";
        String name2= "ahmet";

        if (name1.length()%2==0){
            System.out.println(name1.substring(0, name1.length()/2).concat(name2).concat(name1.substring(name1.length()/2)));

        }else
            System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik");

        Scanner scan = new Scanner(System.in);
        System.out.println("1. ismi girin");
        String isim1 = scan.nextLine();
        System.out.println("2. ismi girin");
        String isim2 = scan.nextLine();


       if (isim1.length()%2==0){
            System.out.println(isim1.substring(0,isim1.length()/2).concat(isim2).concat(isim1.substring(isim1.length()/2)));
        }else {
           System.out.println(isim1 + " ismi çift olmadigi için ortasına " + isim2 + " ismini terlestiremedik");

       }


       String isim3 = "muhammet";
       String isim4 = "safiye";
        System.out.println(isim3.substring(0,isim3.length()/2).concat(isim4).concat(isim3.substring(isim3.length()/2)));


    }

}
