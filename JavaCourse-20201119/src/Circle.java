public class Circle implements Shape {
    private int r;

    public Circle() {
        this(0);
    }

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public int calculateArea() {
        return r*r*3;
    }

    @Override
    public int calculatePerimeter() {
        return 6*r;
    }
}
