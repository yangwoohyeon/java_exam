import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("MILK");
        list.add("BREAD");
        list.add("BUTTER");
        list.add(1,"APPLE");
        list.set(0,"GRAPE");
        list.remove(3);
    }
}
