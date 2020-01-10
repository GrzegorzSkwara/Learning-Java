import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Names {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String name = null;
        while(true) {
            name = scan.next();
            if(name.equals("-")) break;
            names.add(name);
        }

        System.out.println(names);


    }
}
