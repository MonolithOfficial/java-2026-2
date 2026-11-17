package AbstractClassesInterfaces;

public class Main {
    public static void main(String[] args) {
//        Figure figure = new Figure();
        Rectangle rectangle = new Rectangle(10, 10);
        Figure figure = new Rectangle(10, 10);
        if (figure instanceof Rectangle){
            ((Rectangle) figure).describeShape();
        }

        Rectangle rectangle1 = new Rectangle(10, 10);
        recoloring(rectangle1);
//        IRecolorable.CONSTANT

//        Figure figure1 = new Figure() {
//            @Override
//            public double getArea() {
//                return 0;
//            }
//
//            @Override
//            public double getPerimeter() {
//                return 0;
//            }
//        };



    }

    private static void recoloring(IRecolorable recolorable){
        recolorable.recolor();
    }
}
