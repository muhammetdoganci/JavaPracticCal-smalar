package java_OrnekCalişmalar2;

import java.util.Arrays;

public class C03_ForEach {

    public static void main(String[] args) {

        // int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18};
        // verilen array de once cift olan sayilari, sonra da tek olan sayilari for each loop kullanarak yazdiriniz..


        int [] arr = {5,3,9,8,10,22,57,2,1,48,25,24,99,98,18};

        Arrays.sort(arr); // degerleri kucukten buyuge sıralar

        System.out.print("Cift sayilar");
        System.out.println();

        for (int each:arr) {
            if (each%2==0){
                System.out.print(each + " ");
            }
        }
        System.out.println();
        System.out.println("Tek sayilar");
        for (int each:arr) {
            if (each%2!=0){
                System.out.print(each + " ");
            }

        }


    }
}
