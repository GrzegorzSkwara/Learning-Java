public class Main {

    public static void main(String[] args) {
        Thread[] threads = new Thread[10];
        Runnable[] runnables = new Runnable[10]; //tu przypisze oboekty Run

        for(int i =0; i<runnables.length; i++){
            runnables[i] = new Run(i);  //tworze obiekty Run
        }

        for(int i=0; i<threads.length; i++){
            threads[i] = new Thread(runnables[i]); //tworze obiekty wątków
        }

        for(int i =0; i<10; i++){
            threads[i].start();  //uruchamiam wątki
        }

    }

}
