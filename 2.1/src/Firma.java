import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Firma {

    public static void main(String[] args) {
        List<String> imiona = new ArrayList<String>();
        List<String> nazwiska = new ArrayList<String>();
        List<Integer>age = new ArrayList<Integer>();
        Collections.addAll(imiona, "Alfons", "Andrzej", "Marek");
        Collections.addAll(nazwiska, "Bąk", "Nowak", "Buła");
        Collections.addAll(age, 19, 26, 54);

        String[] imie = new String[]{"Alfons", "Andrzej", null};
        String[] n = new String[]{"Bąk", null, null};
        int[] a = new int[]{19,26,54};

        Pracownik[] p = new Pracownik[3];
        for(int i=0; i<p.length; i++){
            p[i] = new Pracownik(imie[i], n[i], a[i]);
            p[i].funkcja();
        }
        Pracownik p1 = new Pracownik(p[1]);
        p1.funkcja();

    }


}
