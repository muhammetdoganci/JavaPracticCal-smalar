package java_OrnekCalismalar;

import java.util.HashMap;

public class C12_HashMap {

    public static void main(String[] args) {

        HashMap<String,String> sozluk = new HashMap<>();
        sozluk.put("book", "kitap");
        sozluk.put("table", "masa");
        sozluk.put("computer", "bilgisayar");

        System.out.println(sozluk);  //{computer=bilgisayar, book=kitap, table=masa}

        System.out.println(sozluk.get("book")); //kitap

        System.out.println("--------------------");

        for (String item : sozluk.keySet()) {
            System.out.println("eleman = "+item+" deger = "+ sozluk.get(item));

        }


    }
}
