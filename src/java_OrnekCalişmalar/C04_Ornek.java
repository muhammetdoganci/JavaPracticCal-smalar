package java_OrnekCalişmalar;

public class C04_Ornek {

    public static void main(String[] args) {
        //0-255 e kadar olan sayi ve harf degerlerini ekrana yazdirin

       //System.out.println("for ile");

       //for (int i = 0; i <=255 ; i++) {
       //    char karakter= (char) i;
       //    System.out.println(i + "-->" + karakter);
        //}

        //System.out.println("while ile");
//
        //int i=0;
        //while (i<=255){
        //    char sembol= (char) i;
        //    System.out.println(i + "-->" + sembol);
        //    i++;
//
        //}

        System.out.println("do while ile");

        int i=0;
        do {
            char a= (char) i;
            System.out.println(i+ "-->" +a);
            i++;

        }while (i<=255);


    }

}
