import java.util.HashSet;
import java.util.Set;
public class FindDupplication {
    public static void main(String[] args) {
        HashSet<String> s = new HashSet<String>();
        String[] a = {"a", "b", "c", "a"};
        for (String i : a) {
            if (!s.add(i)) {
                System.out.println("중복된 단어 : " + i);
            }
        }
        System.out.println(s.size() + "중복되지 않은 단어 : " + s);
    }
}
