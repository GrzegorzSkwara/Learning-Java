public class Main {

    public static void main(String[] args) {
        Figure[] figures = new Figure[4];
        figures[0] = new Triangle(2, 5);
        figures[1] = new Triangle(1, 2, 3);
        figures[2] = new Circle(10);
        figures[3] = new Rectangle(2, 5);

        for (Figure figure : figures) {
            System.out.println(figure.getType());
            System.out.println("obw " + figure.getPerimeter());
            System.out.println("pole " + figure.getArea());
        }

    }
}
