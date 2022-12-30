package java_OrnekCalismalar;

import java.io.File;
import java.io.IOException;

public class WorkingWithFiles {

    public static void main(String[] args) {
        File file = new File("E:\\files\\students.txt");
        try {
            if (file.createNewFile()){
                System.out.println("dosya olusturuldu");
            }else {
                System.out.println("dosya zaten mevcut");
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
