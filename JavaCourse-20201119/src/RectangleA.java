public class RectangleA implements Shape {
    private int x;
    private int y;

    public RectangleA() {
        this(0, 0);
    }

    public RectangleA(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int calculateArea() {
        return x * y;
    }

    @Override
    public int calculatePerimeter() {
        return (2 * x) + (2 * y);
    }
}
