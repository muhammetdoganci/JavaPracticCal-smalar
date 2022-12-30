package java_OrnekCalismalar;

import java.io.*;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {
        readFile();
        writeFile();

    }
    public static void createFile(){
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
    public static void getFileInfo(){
        File file = new File("E:\\files\\students.txt");
        if (file.exists()){
            System.out.println("dosya adı = " + file.getName());
            System.out.println("dosya yolu = " + file.getAbsoluteFile());
            System.out.println("dosya yazilabilir mi = " + file.canWrite());
            System.out.println("dosya okunabilir mi = " + file.canRead());
            System.out.println("dosya boyutu (byte) = " + file.length());
        }
    }

    public static void readFile(){
        File file = new File("E:\\files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        }
    }

    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\files\\students.txt",true));
            writer.newLine();
            writer.write("ahmet");
            System.out.println("dosyaya yazildi");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }


}
