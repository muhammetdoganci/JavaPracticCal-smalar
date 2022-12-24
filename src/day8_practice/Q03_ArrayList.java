package day8_practice;

import java.util.ArrayList;
import java.util.List;

public class Q03_ArrayList {

    public static void main(String[] args) {

        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */

        int[] arr = {2,5,-9,45,43,11,8,102,47};

        int n = 4;

        // bir liste olusturalim

        List<Integer> list=new ArrayList<>();
        for (int each : arr) {
            list.add(each);
        }

        List<Integer> maxList=new ArrayList<>();
        int count = 1;
        while (count<=n){
            int max = list.get(0);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i)>max){
                    max=list.get(i);
                }

            }
            maxList.add(max); // 102 eklendi
            list.remove(list.indexOf(max));// max ekledigim sayiyi listeden kaldiriyorum
            count++;
        }

        System.out.print("Arrayin in max " + n + " elemani " + maxList);


    }
}
