import hw1.animals.Cat;
import hw1.animals.Dog;
import hw1.cars.Car;
public class Main {
    public static void main(String[] args)
    {

        Car car = new Car();
        car.run();
        Cat cat = new Cat("Leopold");
        Cat cat2 = new Cat("Leopold2");
        Cat cat3 = new Cat("Leopold3");
        Cat cat4 = new Cat("Leopold4");
        cat.run(50);
        cat.run(300);
        cat.swim(20);
        System.out.println("We was create "+Cat.getCount()+ " cats");

        Dog dog = new Dog("Barbos");
        Dog dog2 = new Dog("Barbos2");
        Dog dog3 = new Dog("Barbos3");
        dog.run(50);
        dog.run(300);
        dog.swim(20);
        dog.swim(10);
        System.out.println("We was create "+Cat.getCount()+ " cats");
        System.out.println("We was create "+Dog.getCount()+ " cats");
    }
}