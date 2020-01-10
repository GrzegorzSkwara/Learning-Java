public class Rectangle implements Figure {

    float x1;
    float x2;

    public Rectangle(int x1, int x2) {
        this.x1 = x1;
        this.x2 = x2;

    }

    @Override
    public float getPerimeter() {
        return 2*x1+2*x2;
    }

    @Override
    public float getArea() {
        return x1*x2;
    }

    @Override
    public String getType() {
        return "rectangle";
    }
}
