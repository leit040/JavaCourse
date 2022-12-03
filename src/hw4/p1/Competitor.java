package hw4.p1;

public class Competitor {
    private String name = "";
    private int maxDistance = 0;
    private int maxHeight = 0;

    public Competitor(String name, int maxDistance, int maxHeight) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }


    public String getName() {
        return this.name;
    }

    public boolean run(int distance) {
        return this.maxDistance >= distance;
    }

    public boolean jump(int height) {
        return this.maxHeight >= height;
    }
}
