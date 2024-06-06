import java.util.Iterator;

public class MyArrayAlgTest {
    public static void main(String[] args) {
        String[] language ={"C","C++","JAVA"};
        String last = MyArrayAlg.getLast(language);
        System.out.println(last);
        MyArrayAlg.swap(language,1,2);
        for(int i=0; i< language.length; i++){
            System.out.println(language[i]);
        }
    }
}
