package java_OrnekCalismalar;


import java.util.ArrayList;

public class C10_ArraylistDemo {

    public static void main(String[] args) {
        ArrayList sayilar = new ArrayList();

        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");

        System.out.println(sayilar.size()); // 3
        System.out.println(sayilar.get(0)); // sayilarin 0. indexi  1

        sayilar.set(1,50); // sayilarin 1. indexini 50 yap
        System.out.println(sayilar.get(1)); // 1. indeksi getir 50


        //sayilar.set(3,100);
        //System.out.println(sayilar.get(3));
        /*
        IndexOutOfBoundsException: Index 3 out of bounds for length 3
        Dizin Sınır Dışı İstisna: Dizin 3, uzunluk 3 için sınırların dışında
        listenin uzunlugunun disinda bir index yazarsak bu hatayi aliriz

         */

        for (Object o:sayilar){
            System.out.print(o + "-");
        }



    }
}
