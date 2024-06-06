public class OrderedPairTest {
    public static void main(String[] args) {
        OrderedPair<String,Integer> o = new OrderedPair<String,Integer>("양우현",2020037026);
        String s = o.getKey();
        int i=o.getValue();

        System.out.println(s);
        System.out.println(i);
    }
}
