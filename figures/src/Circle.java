public class Circle implements Figure {

    float radious;

    public Circle(float i) {
        radious=i;
    }


    @Override
    public float getPerimeter() {
        return 2*3.14f*radious;
    }

    @Override
    public float getArea() {
        return (float) (3.14f*Math.pow(radious, 2));
    }

    @Override
    public String getType() {
        return "circle";
    }
}
