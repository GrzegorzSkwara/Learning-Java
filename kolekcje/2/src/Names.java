import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Names {

    public static void main(String[] args) {
        Map<String, String> names = new HashMap<>();

        Scanner scan = new Scanner(System.in);

        while (true) {
            String key = scan.next();
            if(key.equals("-")) break;
            String value = scan.next();
            if (value.equals("-")) break;
            else names.put(key, value);
        }

        System.out.println("Podaj imie");

        String nameInput = scan.next();
        int i=0;

        for (Map.Entry<String, String> entry : names.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            if ((key.equals(nameInput))) {System.out.println(key + " " + value); i++;}
            if ((value.equals(nameInput))) {System.out.println(key + " " + value); i++;}

        }

        if(i==0) System.out.println("Nie ma takiego imienia");
    }
}
