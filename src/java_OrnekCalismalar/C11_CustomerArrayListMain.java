package java_OrnekCalismalar;

import java.util.ArrayList;

public class C11_CustomerArrayListMain {

    public static void main(String[] args) {
        ArrayList<C11_CustomerArrayList> customers = new ArrayList<C11_CustomerArrayList>();

        C11_CustomerArrayList muhammet = new C11_CustomerArrayList(1, "Muhammet", "DOGANCİ");
        customers.add(muhammet);
        customers.add(new C11_CustomerArrayList(2, "Safiye", "DOGANCİ"));
        customers.add(new C11_CustomerArrayList(3, "İrem Atike", "DOGANCİ"));
        customers.add(new C11_CustomerArrayList(4, "Halit Erdem", "DOGANCİ"));

        //customers.remove(new C11_CustomerArrayList(1, "Muhammet", "DOGANCİ"));
        customers.remove(muhammet);

        //her new dediğimizde bir referans numarasi olusur. customers.remove dediğimiz halde içine yazdigimiz
        //new tekrardan bir referans numarasi tutacagi icin bu islemi silmez.
        //bu islemi C11_CustomerArrayList consructor indan bir obje uretip bu objenin icine koydugumuzda silme isleminde
        //

        for (C11_CustomerArrayList customer : customers) {
            System.out.println(customer.firstName);
        }


    }
}
