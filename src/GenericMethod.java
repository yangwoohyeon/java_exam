public class GenericMethod {
    public static <T> void printArray(T[] a){
        for(T element:a){
            System.out.printf("%s ",element);
        }
        System.out.println();
    }
}
