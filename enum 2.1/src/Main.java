public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Piotr", 16, Eyes.BLACK, Hair.BLOND);
        Human h2 = new Human("Ania", 26, Eyes.BLUE, Hair.BALD);

        System.out.println(h1.name + h1.age + h1.eye + h1.hair.toString().toLowerCase());
    }
}
