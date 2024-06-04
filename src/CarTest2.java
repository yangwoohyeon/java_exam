public class CarTest2 {
    public static void main(String[] args) {
        Car2 firstCar = new Car2("BMW");
        Car2 secondCar = new Car2("BMW");

        if(firstCar.equal(secondCar)){
            System.out.println("동일한 자동차");
        }
        else{
            System.out.println("다른 자동차");
        }

        System.out.println(firstCar.toString());
    }
}
