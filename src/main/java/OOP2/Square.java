package OOP2;

public final class Square extends Rectangle implements Comparable<Square>{
    private double side;

    public Square(double side){
        super(side, side);
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return this.side * 4;
    }

    @Override
    public double getArea() {
        return Math.pow(this.side, 2);
    }

    @Override
    public int compareTo(Square o) {
        return Double.compare(this.getArea(), o.getArea());
    }


    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
