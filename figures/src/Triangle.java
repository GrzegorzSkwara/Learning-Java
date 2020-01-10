public class Triangle implements Figure {
    float high;
    float basis;
    float x1, x2, x3;

    public Triangle(float high, float basis){
        this.basis=basis;
        this.high=high;
    }

    public Triangle(float x1, float x2, float x3){
        this.x1=x1;
        this.x2=x2;
        this.x3=x3;
    }
    @Override
    public float getPerimeter() {
        return x1+x2+x3;
    }

    @Override
    public float getArea() {
        return high*basis/2;
    }

    @Override
    public String getType() {
        return "triangle";
    }


}
