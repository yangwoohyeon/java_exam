public class Rectangle2 extends Shape2{
    private int width;
    private int height;

    public Rectangle2(int x, int y, int width, int height){
        super(x,y);
        System.out.println("Rectangle()");
        this.height=height;
        this.width=width;
    }
}
