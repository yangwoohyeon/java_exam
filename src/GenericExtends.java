import java.util.Arrays;
import java.util.List;

public class GenericExtends {
    public static double sumOfList(List<? extends Number> list){
        double s = 0.0;
        for(Number n : list){
            s+=n.doubleValue();
        }
        return s;
    }

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3);
        System.out.println(sumOfList(li));
    }
}
