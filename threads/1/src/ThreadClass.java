public class ThreadClass extends Thread {
    private final int i;
    public ThreadClass(int i){
        this.i=i;
    }

    @Override
    public void run() {
        if(i>0){
            ThreadClass tread = new ThreadClass(i-1);
            System.out.println(getName());
            tread.start();
        }
    }
}
