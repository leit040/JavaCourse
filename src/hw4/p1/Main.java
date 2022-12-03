package hw4.p1;


public class Main {

    public static void main(String[] args) {
        Competitor[] competitors = {
                new Competitor("Human", 1000, 2),
                new Competitor("Cat", 600, 4),
                new Competitor("Android", 10000, 10),
        };
        Obstacle[] obstacles = {
                new Obstacle("Wall", "height", 2),
                new Obstacle("SuperWall", "height", 4),
                new Obstacle("Treadmill", "distance", 600),
                new Obstacle("Marathon", "distance", 3250),
        };

        for (Competitor competitor : competitors) {
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.overcome(competitor)) {
                    System.out.printf("%s goes out of the way((\n", competitor.getName());
                    break;
                }
            }
        }


    }


}
