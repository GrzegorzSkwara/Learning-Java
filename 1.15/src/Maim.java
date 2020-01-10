import java.io.RandomAccessFile;

public class Maim {

    public static void main(String[] args) {
        RandomAccessFile strumien = null;
        int bajt = 0;
        String name = "Grzegorz";
        int year = 2020;
        float number = 50/4;
        try{
            Write write = new Write(name, year, number);
            write.writeTo();
        } catch (Exception e){
            System.out.println("Błąd");
        }

        try {
            strumien = new RandomAccessFile("file.txt", "rw");

            while (strumien.read() != -1) {
                bajt++;
            }
        }catch (Exception e) {
            System.out.println("błąd");
        }
        try{
        strumien.close();
        }catch (Exception e){
            System.out.println("błąd");
        }

        System.out.println("ilosc bajtow to " + bajt);

    }



}
