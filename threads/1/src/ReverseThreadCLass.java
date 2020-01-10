public class ReverseThreadCLass extends Thread {
    private final int i;


    public ReverseThreadCLass(int i) {
        this.i=i;
    }

    @Override
    public void run() {
        if(i>0){
            ReverseThreadCLass thread = new ReverseThreadCLass(i-1);
            thread.start();
            try {
                thread.join();  //aktualny wątek czekan na zakonczenie wątku na ktorym jest join
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName());
        }
    }
}
