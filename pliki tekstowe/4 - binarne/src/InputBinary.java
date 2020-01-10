import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputBinary {

    DataInputStream input = null;
    int day;
    int month;
    int year;

    void inputMethod() {
        try {
            input = new DataInputStream(new FileInputStream("plik.bin"));
            day = input.readInt();
            month = input.readInt();
            year = input.readInt();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(input!=null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println(day);
        System.out.println(month);
        System.out.println(year);
    }
}
