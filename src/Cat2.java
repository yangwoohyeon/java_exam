public class Cat2 extends Animal2{
    public static void eat(){
        System.out.println("Cat의 정적메소드 eat()");
    }
    public void sound(){
        System.out.println("Cat의 인스턴스 메소드 sound()");
    }

    public static void main(String[] args) {
        Cat2 myCat = new Cat2();
        Animal2 myAnimal = new Animal2();
        Animal2.eat();
        myAnimal.sound();
    }
}
