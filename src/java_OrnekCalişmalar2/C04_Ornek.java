package java_OrnekCalişmalar2;

import java.util.Arrays;

public class C04_Ornek {

    public static void main(String[] args) {

        // String[] liste = {"meyveler", "sebzeler", "et", "süt"};
        // her döngü için diziyi yazdır
        // her elemanın uzunluğunu yazdır

        // Bölüm 2:
        // for eachLoop kullanarak dizideki tüm öğeleri yazdırın
        // Bir eleman 'v' ile başlıyorsa döngüden çık

        String[] liste={"meyveler", "sebeler", "et", "süt"};
        System.out.println(Arrays.toString(liste));

        for (String each : liste) {
            System.out.println(each + " : " + each.length());
        }
        System.out.println();

            //bolum 2

            for (String eleman : liste) {
                if (eleman.startsWith("e")){ // e ile başlayan elemandan itibaren sil gerisini yazdır
                    break;
                }
                System.out.println(eleman + " ");


            }

        }


    }

