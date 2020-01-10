import java.util.concurrent.atomic.AtomicInteger;

public class HelloWordThreads {
    private static final int ITERATIONS = 5;

    public static void main(String[] args) {

        AtomicInteger startStop = new AtomicInteger(1);
        Thread t1 = new Thread(() -> {
                while (startStop.get() == 1) {
                    System.out.println("Hello");
                    startStop.set(0);
                    waiting(startStop);

                }

        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 4; i++) {
                while (startStop.get() == 1) {
                    System.out.println("word");
                    startStop.set(0);
                }
            }
        });

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 4; i++) {
                while (startStop.get() == 1) {
                    System.out.println("!");
                    startStop.set(0);

                }
            }
        });


    }


    public static AtomicInteger waiting(AtomicInteger startStop){

    }
}
