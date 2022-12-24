package day4_practice;

import java.util.Scanner;

public class Q02_MethodCreation {

    public static void main(String[] args) {

        /*
        cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("metre ve km ye donuşturmek istediğin cm gir : ");
        double santiMeterValue= scan.nextDouble();

        convertSM(santiMeterValue);
    }

    public static void convertSM(double santiMetreValue) {

        double metre= santiMetreValue/100;
        double Kmetre= santiMetreValue/100000;

        System.out.println("girdiginiz cm degeri : " + santiMetreValue + " cm " + metre + " metredir " + Kmetre + " km dir" );

    }
}
