import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class Create {

    public static void main(String[] args) {

        BiFunction<Integer, String, Human> humanCreator = Human::new;
        Human human = humanCreator.apply(26, "Piotr");
        System.out.println(human.getAge());
        System.out.println(human.getName());

    }
}
