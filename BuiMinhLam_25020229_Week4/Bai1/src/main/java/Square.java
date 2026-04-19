public class Square extends Shape{
    protected int x, y;

    public Square(int x, int y) {
        super(x, y);
//        this.x = x;
//        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Vẽ hình vuông tại (" + x + ", " + y + ")");
    }

    public void erase() {
        System.out.println("Xoá hình vuông tại (" + x + ", " + y + ")");
    }
}
