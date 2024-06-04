public class ShapeTest5 {
    private static Shape4 array[];

    public static void main(String[] args) {
        init();
        Rectangle4 s1 = new Rectangle4();
        Triangle4 s2 = new Triangle4();

        printLocation(s1);
        printLocation(s2);
    }
    public static void init(){
       array=new Shape4[3];
       array[0]=new Circle4();
       array[1]=new Triangle4();
       array[2]=new Rectangle4();
    }

    public static void drawAll(){
        for(int i=0; i<array.length; i++){
            //arrayOfShapes[i].draw();
        }
    }

    public  static void printLocation(Shape4 s){
        System.out.println(s.x+" "+ s.y);
    }
}
