import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main implements Serializable {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("kot", "dzik", "pies");
        List<String> namesInput = new ArrayList<>();

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("plik.txt"))) {
            outputStream.writeObject(names);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("plik.txt"))) {
            namesInput = (List<String>) inputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(namesInput);

    }

}
