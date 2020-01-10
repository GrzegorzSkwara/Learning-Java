import java.util.Vector;
import java.util.Scanner;
public class Vec {

    void adding(Vector v) {

        Scanner scan = new Scanner(System.in);

        System.out.println("podaj ile ");

       int ile = scan.nextInt();

        for (int i = 0; i < ile; i++) {
            v.add(i + 10);

            //System.out.println("i = " + i + " v[" + i + "] = " + v);

        }

    }
}