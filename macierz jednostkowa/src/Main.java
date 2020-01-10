import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[][] t = new int [4][4];
        Random random = new Random();


        for(int i = 0; i<t.length; i++){
            for(int j =0; j<t[i].length; j++){
                if(i==j)t[i][j]=1;
                else t[i][j]=random.nextInt(11);
                System.out.print(t[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println();
        Sort sort = new Sort(t);
        sort.sortMethod();



    }
}
