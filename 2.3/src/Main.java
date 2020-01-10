
public class Main {

    public static void main(String[] args) {
        int x =34;
        int y = 18;
        Integer z = 100;
        Punkt p = new Punkt(x, y, z);
        p.zwieksz();
        System.out.println(p.x + " " + p.y + " " +p.z);
        p.zmien();
        System.out.println(p.x + " " + p.y);
    }
}
