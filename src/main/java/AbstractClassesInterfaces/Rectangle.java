package AbstractClassesInterfaces;

import java.util.List;

public class Rectangle extends Figure implements IRecolorable, IResizable{
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        List<String> listOfStr;
    }

    @Override
    public double getArea() {
        return sideA * sideB;

    }

    @Override
    public double getPerimeter() {
        return (sideA + sideB) * 2;
    }

    public void describeShape(){
        System.out.println("RECT");
    }

    @Override
    public String recolor(String color) {
        System.out.println(String.format("COLOR HAS BEEN SET TO %s", color));
        return color;
    }

    @Override
    public void recolor() {
        System.out.println("COLOR HAS BEEN SET TO BLACK");
    }

    @Override
    public int resize(int coefficient) {
        this.sideA *= coefficient;
        this.sideB *= coefficient;
        return coefficient;
    }

    @Override
    public void doubleSize() {
        this.sideA *= 2;
        this.sideB *= 2;
    }
}
