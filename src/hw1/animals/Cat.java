package hw1.animals;

public class Cat extends Animal{

    protected static int count = 0;
    public Cat(String name){
        this.name = name;
        this.runLimit = 200;
        this.canSwim = false;
        this.increaseCount();

    }
    protected void increaseCount(){
        count++;
    }
    public static int getCount(){
        return count;
    }
}
