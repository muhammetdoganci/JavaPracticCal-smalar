package java_OrnekCalismalar;

import java.util.Scanner;

public class C01_arrays {


        public static void main(String[] args) {

        //kullanicidan aldiginiz bir ismin vrilen arrayde içerip icermediğini
        //kontrol edip bize tru veya false sonucu donen bie methos olusturun

        String [] isimler={"Basak", "Nurullah", "Fatih", "Adem", "Enes"};
        Scanner scan=new Scanner(System.in);
        System.out.println("Aradiğiniz ismi yazin");
        String arananİsim=scan.nextLine();

        boolean sonuc= contains(isimler,arananİsim);
        if (sonuc){
            System.out.println("Girilen isim listede var");
        }else {
            System.out.println("Girilen isim listede yok");
        }

    }

        public static boolean contains(String[] isimler, String arananİsim) {
            boolean sonucMethod = false;

            for (int i = 0; i < isimler.length; i++) {
                if (isimler[i].equalsIgnoreCase(arananİsim)) {
                    sonucMethod = true;
                }
            }


            return sonucMethod;

        }


    }


