import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {


            File file = new File("file.txt");
            Scanner scanIn = new Scanner(file);
            String zdanie = scanIn.nextLine();
            System.out.println(zdanie);

            Write write = new Write();
            write.writeToFile();

    }
}
