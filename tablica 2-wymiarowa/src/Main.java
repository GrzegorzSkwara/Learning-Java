public class Main {
    public static void main(String[] args) {
        int [][]tab = new int[2][3];
        int count = 0;
        for(int i = 0; i<tab.length; i++){
            for(int j =0; j<tab[i].length; j++){
                tab[i][j] = count;
                count++;
            }
        }

        for(int[] wiersz:tab){
            for(int element:wiersz){
                System.out.println(element);
            }
        }

    }
}
