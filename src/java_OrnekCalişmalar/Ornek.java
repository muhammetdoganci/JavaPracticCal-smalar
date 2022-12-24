package java_OrnekCalişmalar;

public class Ornek {

    public static void main(String[] args) {

        // verilen sayiya gore carpim tablosu olusturun
        /*
       input 3
        1 2 3
        2 4 6
        3 6 9
         */

        int sayi=4;

        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=sayi ; j++) {
                System.out.print(i*j + " ");


            }
            System.out.println("");


        }
    }
}
