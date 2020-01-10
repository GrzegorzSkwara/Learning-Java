import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Binary {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        int month = scan.nextInt();
        int year = scan.nextInt();

        DataOutputStream output = null;

        try {
            output = new DataOutputStream(new FileOutputStream("plik.bin"));
            output.writeInt(day);
            output.writeInt(month);
            output.writeInt(year);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(output!=null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
InputBinary inputBinary = new InputBinary();
        inputBinary.inputMethod();
    }
}
