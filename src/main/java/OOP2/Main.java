package OOP2;

public class Main {
    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
//        Ball ball = methodOverloading.shoot(new Ball());
        methodOverloading.shoot(new Ball());


//        methodOverloading.shoot(new Ball(), new Ball(), new Ball());

        Rectangle rectangle = new Rectangle(10, 20);
        Figure figure = new Figure();
        System.out.println(Figure.numberOfAllowedInstances);
    }
}
