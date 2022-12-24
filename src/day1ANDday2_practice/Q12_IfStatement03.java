package day1ANDday2_practice;


import java.util.Scanner;

public class Q12_IfStatement03 {
		/*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
       */
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("iş ünvanınızı girin");
            String isUnvani = scan.nextLine();
            if (isUnvani.equals("qa")){
                System.out.println("Quality Analyst");
            } else if (isUnvani.equals("dev")) {
                System.out.println("Developer");
            } else if (isUnvani.equals("ba")) {
                System.out.println("Business Analyst");
            } else if (isUnvani.equals("pm")) {
                System.out.println("Project Manager");
            }else {
                System.out.println("yanlış giris yaptiniz");
            }

            switch (isUnvani){
                case "qa":
                    System.out.println("Quality Analyst");
                    break;
                case "dev":
                    System.out.println("Developer");
                    break;
                case "ba":
                    System.out.println("Business Analyst");
                    break;
                case "pm":
                    System.out.println("Project Manager");
                    break;
                default:
                    System.out.println("yanlış giris yaptiniz");
            }


        }
}

