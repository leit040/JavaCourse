package hw4.p0;

public class Square  extends Figure
{

    private double sideLength = 0;


    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getArea() {
        return (double) Math.pow(this.sideLength, 2);
    }
}
