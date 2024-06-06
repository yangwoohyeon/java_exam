import java.util.HashSet;

public class SetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("Milk");
        set.add("Bread");
        set.add("Butter");
        set.add("Milk");
        System.out.println(set);
    }
}
