import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        PrintWriter write = new PrintWriter("file.txt");
        write.println(sentence);
        write.close();

        File file = new File("file.txt");
        Scanner scanFromFile = new Scanner(file);
        System.out.println(scanFromFile.nextLine());
    }
}
