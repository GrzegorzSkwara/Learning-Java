import java.lang.reflect.Array;
import java.util.Arrays;

public class Sort {

int [][] t;
    public Sort(int[][] t) {
        this.t =t;
    }


    void sortMethod(){

        for(int i[]:t){
            Arrays.sort(i);
        }


        for (int[] ints : t) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");

            }
            System.out.println("");
        }

    }


}
