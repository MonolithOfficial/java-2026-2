package OOP2;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getPerimeter() {
        return (sideA + sideB) * 2;
    }

    @Override
    public double getArea() {
            return sideA * sideB;
    }

    // INNER CLASS
//    public class Square extends Rectangle {
//        private double side;
//
//        public Square(double side){
//            super(side, side);
//            this.side = side;
//        }
//
//        @Override
//        public double getPerimeter() {
//            return this.side * 4;
//        }
//
//        @Override
//        public double getArea() {
//            return Math.pow(this.side, 2);
//        }
//    }
}
