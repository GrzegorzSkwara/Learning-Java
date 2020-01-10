import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("liczba 0 przerywa program");
        System.out.println("podaj liczbe do spierwiastkowania: ");
        Scanner scan = new Scanner(System.in);

        float number = 0f;
        //int end = scan.nextInt();

        while(true) {
            try {
                number = scan.nextFloat();
                if(number<0){
                    throw new IllegalArgumentException("Liczba pierwiastkowana musi byc dodatnia");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Błąd! Podaj liczbę jeszcze raz");
                scan.next();
            }
        }

        System.out.println("WYnik to " + Math.sqrt(number));


    }
}
