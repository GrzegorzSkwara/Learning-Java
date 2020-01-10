import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        BufferedReader fileReader = null;
        int countLine = 0;
        String line = "";


        try {
            fileReader = new BufferedReader(new FileReader("plik.txt"));
            while (true) {
                line = fileReader.readLine();
                if(line==null)break;

                countLine++;
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileReader!=null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println(countLine);


    }
}
