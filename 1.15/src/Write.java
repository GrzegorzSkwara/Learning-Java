import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Write {
String name;
int year;
float number;
    public Write(String name, int year, float number){
        this.name = name;
        this.year = year;
        this.number = number;
    }
    public void writeTo() throws FileNotFoundException {
        PrintWriter write = new PrintWriter("file.txt");
        write.println(name);
        write.println(year);
        write.println(number);
        write.close();
    }
}
