package day4_practice;

public class Q05_ForLoop {

    public static void main(String[] args) {


        //0-255 e kadar olan sayi ve harf degerlerini ekrana yazdirin

       // System.out.println("for ile");
       // for (int i = 0; i <=255 ; i++) {
       //     char c = (char) i; // cating yaptik sayi harf ve karakter
       //     System.out.println(i + " -> " +c);
        //}

        System.out.println("while ile");
      // int i=0;
      // while (i<=255){
      //     char sembol = (char) i;
      //     System.out.println(i+ " - " + sembol);
      //     i++;
      //  }

        System.out.println("do while");
        int a = 0;
        do {
            char karakter = (char) a;
            System.out.println(a + " " + karakter);
            a++;
        }while (a<=255);



    }

}
