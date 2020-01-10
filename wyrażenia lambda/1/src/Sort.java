import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sort {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Konstantynopol", "kot", "lustro");

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        List<Integer> list2 = Arrays.asList(2, 10, 56789, 0, -56);

        list2.sort((o1, o2) -> o2-o1);

        System.out.println(list);
        System.out.println(list2);
    }
}
