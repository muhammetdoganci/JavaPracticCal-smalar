package java_OrnekCalismalar;

public class C07_MukemmelSayi {

    public static void main(String[] args) {
        // mukemmel sayi kendisi haric tum tam bolenlerinin toplamı kendisine esit olan sayiya denir
        // 6---> 1,2,3 ---> 6 sayisi mükemmel sayidir
        // 28---> 1,2,4,7,14 ---> 28 sayisi mükemmel sayidir
        int sayi = 28;
        int toplam = 0;

        for (int i = 1; i <sayi ; i++) {
            if (sayi % i == 0){
                toplam+=i;
            }

        }
        if (toplam==sayi){
            System.out.println(sayi + " sayisi mukemmel sayidir.");
        }else {
            System.out.println(sayi + " sayisi mukemmel sayi degildir.");
        }
    }
}
