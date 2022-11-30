package hw1.animals;

public class Dog extends Animal {
    protected static int count = 0;

    public Dog(String name) {
        this.name = name;
        this.runLimit = 500;
        this.canSwim = true;
        this.swimLimit = 10;
        this.increaseCount();

    }
    protected void increaseCount(){
        count++;
    }
    public static int getCount(){
        return count;
    }
}
