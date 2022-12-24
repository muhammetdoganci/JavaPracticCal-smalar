package java_OrnekCalişmalar2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_Ornek {
    public static void main(String[] args) {

        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */

        int[] arr ={3,8,-1,45,89,23,51,15,199,84,36};
        Arrays.sort(arr);

        int n=5;

        List<Integer> liste=new ArrayList<>();
        for (int each:arr) {
            liste.add(each);
        }

        List<Integer> maxListe=new ArrayList<>();
        int sayac=1;
        while (sayac<=n){
            int max = liste.get(0);
            for (int i = 0; i <liste.size(); i++) {
                if (liste.get(i)>max){
                    max=liste.get(i);
                }

            }
            maxListe.add(max);
            liste.remove(liste.indexOf(max));
            sayac++;

        }

        System.out.print("Arrayin max " + n + " tane elemani : " + maxListe + "\n");
        System.out.println("liste : " + liste);


    }
}
