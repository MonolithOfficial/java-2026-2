package OOP2;

public class Figure {
    protected static int numberOfAllowedInstances;
    static {
        numberOfAllowedInstances = 10;
    }
    protected double area;
    protected double perimeter;

    public double getArea(){
        return -1;
    }

    public double getPerimeter(){
        return -1;
    }
}
