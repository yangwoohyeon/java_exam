public class Box2<T> {
    private T data;
    public void set(T data){
        this.data=data;
    }
    public T get(){
        return data;
    }

    public static void main(String[] args) {
        Box2<String> b = new Box2<String>();
        Box2<Integer> b2 = new Box2<Integer>();
        b.set("Hello world");
        String s = b.get();
        System.out.println(s);
    }
}
