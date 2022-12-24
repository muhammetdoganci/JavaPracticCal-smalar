package java_OrnekCalismalar;

public class C06_AsalSayi {

    public static void main(String[] args) {

        int number = 67;
        int remainder = number % 2;

        //System.out.println(remainder);
        boolean isPrime = true;

        if (number<2){
            System.out.println("Geçersiz sayı girdiniz 2 ve 2'den büyük bir sayı giriniz");
            return;
        }

        for (int i=2; i<number; i++){
            if (number % i == 0){
                isPrime = false;

            }
        }
        if (isPrime){
            System.out.println(number + " Sayısı Asaldır");
        }else {
            System.out.println(number + " Sayısı asal değildir");
        }
    }
}
