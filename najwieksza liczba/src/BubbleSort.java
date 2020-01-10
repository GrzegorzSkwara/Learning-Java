public class BubbleSort {

    double max = 0;
    void sort(double [] tab){

      max = tab[0];

        for(int i = 1; i<tab.length; i++){
            if(tab[i] >= max) max = tab[i];

        }

    }
}
