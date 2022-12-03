package hw4.p1;

public class Obstacle {
    private String name = "";
    private String type = "";
    private int value = 0;

    public Obstacle(String name, String type, int value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public boolean overcome(Competitor competitor) {
        switch (this.type) {
            case "distance" -> {
                boolean result = competitor.run(this.value);
                this.printResult(result, competitor.getName());
                return result;
            }
            case "height" -> {
                boolean result = competitor.jump(this.value);
                this.printResult(result, competitor.getName());
                return result;
            }
            default -> {
            }
        }
        return false;
    }

    private void printResult(boolean result, String competitorName) {
        String message = result ? "overcame  obstacle" : "did not overcome  obstacle";
        System.out.printf("%s %s %s (%d m.) \n", competitorName, message, this.name, this.value);

    }

}
