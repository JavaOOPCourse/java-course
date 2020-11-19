public class Triangle implements Shape {
    private int h;
    private int base;

    public Triangle() {
        this(0, 0);
    }

    public Triangle(int h, int base) {
        this.h = h;
        this.base = base;
    }

    @Override
    public int calculateArea() {
        return h * base / 2;
    }

    @Override
    public int calculatePerimeter() {
        return 0;
    }
}
