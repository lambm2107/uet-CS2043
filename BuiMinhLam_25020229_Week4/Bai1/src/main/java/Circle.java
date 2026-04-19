public class Circle extends Shape{
    protected int x, y;

    public Circle(int x, int y) {
        super(x, y);
//        this.x = x;
//        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Vẽ hình tròn tại (" + getX() + ", " + getY() + ")");
    }

    public void erase() {
        System.out.println("Xoá hình tròn tại (" + getX() + ", " + getY() + ")");
    }
}
