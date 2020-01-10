import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        int i = 0;
        String napis = "qwertyuioasdfghjkxcvbnmkgfdvbnjkjgbnmkiuytgfvbnjkiuytfvbnjuygf";
        list.add(i, napis);
        while(true){

            System.out.println("Nr przejscia " + i);
            list.add(napis+list.get(i));
            i++;
        }
    }
}
