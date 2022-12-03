package hw4.p0;

public class Triangle  extends Figure
{
    private double sideA = 0;
    private double sideB = 0;
    private int angleBetweenAB = 0;

    public Triangle(double sideA,double sideB, int angleBetweenAB)
    {
        this.sideA = sideA;
        this.sideB = sideB;
        this.angleBetweenAB = angleBetweenAB;
    }
    public double getArea() {
        return (this.sideA*this.sideB*Math.sin(angleBetweenAB))/2; //S = (ab*sin A)/2
    }
}
