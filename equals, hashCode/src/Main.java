public class Main {

    public static void main(String[] args) {

        Human h1 = new Human("Antek", "Macior", 60);
        Human h2 = new Human("Alojzy", "Ptyś", 56);
        Human h3 = new Human("Antek", "Macior", 60);
        Human h4 = new Human("Antek", "Macior", 30);

        System.out.println("h1.equals(h2): " + h1.equals(h2));
        System.out.println("h1.equals(h3): " + h1.equals(h3));
        System.out.println("h1.equals(h4): " + h1.equals(h4));
        System.out.println("h1.equals(null): " + h1.equals(null));
        System.out.println(h1.hashCode() + " " + h2.hashCode() + " " + h3.hashCode());
        
    }
}
