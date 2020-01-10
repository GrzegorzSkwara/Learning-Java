public class Main {
    public static void main(String[] args) {
        Point p = new Point(25, 25);
        System.out.println(p.x+ " " +p.y);
        Point p2 = new Point();
        System.out.println(p2.x+ " " + p2.y);

        Punkt3D d = new Punkt3D();
        d.z = 100;
        d.x = 200;
        System.out.println(d.x + " " + d.y + " " + d.z);
    }
}
