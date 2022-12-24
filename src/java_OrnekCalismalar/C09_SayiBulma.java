package java_OrnekCalismalar;

public class C09_SayiBulma {

    public static void main(String[] args) {

        int[] sayilar = new int[]{1,2,5,8,9,0};
        int aranacakSayi = 8;
        boolean varMi = false;

        for (int sayi : sayilar){
            if (sayi==aranacakSayi){
                varMi = true;
                break;
            }
        }
        if (varMi){
            System.out.println("Sayi mevcuttur.");
        }else {
            System.out.println("Sayi mevcut degildir.");
        }



    }
}
