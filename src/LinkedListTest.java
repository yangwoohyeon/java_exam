import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("우현");
        list.add("양");
        list.add("희은");
        list.set(2,"박하");
//        for(int i=0; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }
        String s;
        Iterator e = list.iterator();
        while(e.hasNext()){
            s = (String)e.next();
            System.out.println(s);
        }
    }
}
