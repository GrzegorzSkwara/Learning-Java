public class Main {

    public static void main(String[] args) {
        String a = "a";
        String s = "s";

        StringBuffer buffer = new StringBuffer(a);  //klasa synchronizowana
        StringBuilder builder = new StringBuilder(s); //klasa nie synchronizowana

        long start = System.nanoTime();
        for(int i =0; i<100000; i++){
            buffer.append("a");
        }
        a=buffer.toString();
        System.out.println("Czas dla StringBuffer " + (System.nanoTime()-start));

        long start2 = System.nanoTime();
        for(int i=0; i<100000; i++){
            builder.append("s");
        }
        s=builder.toString();
        System.out.println("Czas dla StringBuilder " + (System.nanoTime() - start2));
    }
}
