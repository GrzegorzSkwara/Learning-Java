import java.util.Vector;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj ilosc liczb");
        Scanner scan = new Scanner(System.in);
        int ile = scan.nextInt();
        double tab[] = new double[ile];

        for(int i =0; i<tab.length; i++){
            System.out.println("podaj " + (i+1) + " liczbe");
            tab[i] = scan.nextDouble();
        }

        BubbleSort sort = new BubbleSort();
        sort.sort(tab);
        System.out.println("max to " + sort.max);




    }

}
