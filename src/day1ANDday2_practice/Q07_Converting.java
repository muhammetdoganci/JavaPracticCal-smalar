package day1ANDday2_practice;

import java.util.Scanner;

public class Q07_Converting {
    /*
        galonu litreye ceviren bir java programi yaziniz
            1 gallon = 3.785 litre
        litreyi galona ceviren bir java programi yaziniz
            1 litre = 1/3.785 gallon

        // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
        // formül
        // c = (f-32)*5/9
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("galon cinsinde ağırlık giriniz");
        double agrırlık = scan.nextDouble();
        double litre= agrırlık*3.785;
        System.out.println("agirligin litre cinsinden degeri : " + litre);
        System.out.println("litre cinsinden agirlik giriniz");
        double agirlikLitre = scan.nextDouble();
        double galon = agirlikLitre/3.785;
        System.out.println("agirligin galon cinsinden degeri : " + galon);


        System.out.println("fahrenayt cinsinden sicaklik degeri giriniz");
        double sicaklikFah = scan.nextDouble();
        double sicaklikSant = (sicaklikFah-32)*5/9;
        System.out.println("Sicakligin santigrat cinsinden degeri : " + sicaklikSant);


    }



}
