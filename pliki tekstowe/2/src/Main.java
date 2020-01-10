import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line;

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("plik.txt");
            System.out.println("Podaj tekst");

            while (true) {
                line = scan.nextLine();
                if (line.equals("-")) break;


                fileWriter.write(line);
                fileWriter.write(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileWriter!=null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
