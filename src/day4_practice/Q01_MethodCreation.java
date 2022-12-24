package day4_practice;

public class Q01_MethodCreation {

    public static void main(String[] args) {

     /*
    Problem tanımı :
    Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
    Test Data:
    input: "aabbcccccddddaaa"
    output: abcd
 */

        birKereYazdir("muhammetmuammet");

    }

    private static void birKereYazdir(String str) {

        String output="";

        for (int i = 0; i < str.length(); i++) {

            if (!str.contains(str.substring(i, i + 1))) ;
            {
                output += str.substring(i, i + 1);

            }
        }

        System.out.println(output);
    }

}
