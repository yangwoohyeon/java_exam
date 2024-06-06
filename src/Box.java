public class Box {
    private Object data;
    public void set(Object data){
        this.data = data;
    }
    public Object get(){return data;}

    public static void main(String[] args) {
        Box b = new Box();
        b.set("Hello World");
        String s = (String)b.get();
        b.set(10);
        int i = (Integer)b.get();
        System.out.println(i+" "+s);
    }
}
