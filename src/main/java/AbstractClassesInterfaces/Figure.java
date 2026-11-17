package AbstractClassesInterfaces;

public abstract class Figure {
    protected static int numberOfAllowedInstances;
    static {
        numberOfAllowedInstances = 10;
    }
    protected double area;
    protected double perimeter;

    public abstract double getArea();

    public abstract double getPerimeter();
    public double doSomething(){
        return 0.0;
    };
}
