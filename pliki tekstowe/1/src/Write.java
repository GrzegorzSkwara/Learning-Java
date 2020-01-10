import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Write {

    public void writeToFile() throws FileNotFoundException {
        PrintWriter writeIn = new PrintWriter("file2.txt");
        writeIn.println("Moje nazwisko to Skwara");
        writeIn.close();
    }
}
