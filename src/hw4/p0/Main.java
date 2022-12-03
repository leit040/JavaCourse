package hw4.p0;


public class Main {

    public static void main(String[] args) {

        Figure[] array =
                {
                        new Circle(9.81),
                        new Square(45.9),
                        new Triangle(12, 16, 113)
                };

        System.out.println(Main.getTotalArea(array));
    }

    public static double getTotalArea(Figure[] array) {
        double result = 0;
        for (Figure figure : array) {
            result += figure.getArea();
        }
        return result;
    }

}