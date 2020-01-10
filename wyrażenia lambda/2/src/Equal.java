import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Equal {
    public static void main(String[] args) {
        Supplier<Object> objectCreator = Object::new;
        Object objectInstance = objectCreator.get();
        System.out.println(objectInstance);

        BiPredicate<Object, Object> equalOnClass = Object::equals;
        System.out.println(equalOnClass.test(objectInstance, new Object()));

        Predicate<Object> equalOnObject = objectInstance::equals;
        System.out.println(equalOnObject.test(new Object()));






    }
}
