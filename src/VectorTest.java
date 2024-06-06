import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {

        Vector vc = new Vector();
        vc.add("Hello World");
        vc.add(new Integer(10));
        vc.add(20);
        System.out.println("Vector size = "+vc.size());

        for(int i=0; i<vc.size(); i++){
            System.out.println(vc.get(i));
        }

        String s = (String)vc.get(0);
        System.out.println(s);

    }
}
