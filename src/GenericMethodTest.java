public class GenericMethodTest {
    public static void main(String[] args) {
        Integer[] iArray = { 10, 20, 30, 40, 50 };
        Double[] dArray = { 1.1, 1.2, 1.3, 1.4, 1.5 };
        Character[] cArray = { 'K', 'O', 'R', 'E', 'A' };
        GenericMethod.printArray(iArray);
        GenericMethod.printArray(dArray);
        GenericMethod.printArray(cArray);

    }
}
