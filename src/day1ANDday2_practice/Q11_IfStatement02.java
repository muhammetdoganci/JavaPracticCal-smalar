package day1ANDday2_practice;

import java.util.Scanner;

public class Q11_IfStatement02 {
    /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("notunuzu girin");
        int not = scan.nextInt();

        if (not>=90){
            System.out.println("A");
        } else if (not>=80) {
            System.out.println("B");
        } else if (not>=70) {
            System.out.println("C");
        } else if (not>=60) {
            System.out.println("D");
        } else if (not<59) {
            System.out.println("F");
        }else {
            System.out.println("geçerli bir not giriniz");
        }


        System.out.print("Vize notunuzu giriniz: ");
        int vize = scan.nextInt();
        System.out.print("Final notunu giriniz: ");
        int fınal = scan.nextInt();

        double not1 = (vize * 0.4) + (fınal * 0.6);

        System.out.println("Yıl sonu notunuz = " + not);

        if(not1 > 90) {
            System.out.println("AA ile dersi geçtiniz.");
        }
        else if(not1 > 85) {
            System.out.println("BA ile dersi geçtiniz.");
        }
        else if(not1 > 80) {
            System.out.println("BB ile dersi geçtiniz.");
        }
        else if(not1 > 75) {
            System.out.println("CB ile dersi geçtiniz.");
        }
        else if(not1 > 50) {
            System.out.println("Kosullu geçtiniz.");
        }else {
            System.out.println("Kaldiniz.");
        }

    }
}
