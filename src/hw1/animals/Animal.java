package hw1.animals;

public abstract class Animal implements AnimalInterface {
    protected String name = "";
    protected float runLimit = 0;
    protected float swimLimit = 0;
    protected boolean canSwim = false;


    @Override
    public void run(float distance) {
        String message = "";
        if (distance <= this.runLimit) {
            message = this.name + " ran " + distance;
        } else {
            message = distance + " is more then I can  run through";
        }
        System.out.println(message);
    }

    @Override
    public void swim(float distance) {
        String message = "";
        if (this.canSwim & distance <= this.swimLimit) {
            message = this.name + " swim " + distance;
        } else {
            if (!this.canSwim) {
                message = "Sorry, I can't swim";
            } else {
                message = distance + " is more then I can swim";
            }
        }
        System.out.println(message);
    }

}

