public class ShapeTest4 {
    public static void main(String[] args) {
//        Shape4 s1,s2;
//        s1=new Rectangle4();
//        s2=new Circle4();
//
        Shape4 s = new Rectangle4();
        Rectangle4 r = new Rectangle4();
        ((Rectangle4)s).setWidth(10);
        s.x=0;
        s.y=0;
        // s.width=100;
        r.x=10;
        r.y=20;
    }
}
