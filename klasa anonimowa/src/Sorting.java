import java.util.*;

public class Sorting {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Grzegorz", "Konstantynopol", "kot", "wieża");

        System.out.println("przed sortowaniem: " + names );

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        System.out.println("Po sortowaniu: " + names);

    }

}
