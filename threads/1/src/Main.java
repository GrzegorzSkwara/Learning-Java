import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        //startThreads(i);
        reservedStartThreads(i);

    }

    public static void startThreads(int i) {
        new ThreadClass(i).start();
    }

    public static void reservedStartThreads(int i){
        new ReverseThreadCLass(i).start();
    }
}
