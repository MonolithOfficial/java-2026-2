package OOP2;

import java.util.List;

public class MethodOverloading {
    public void shoot(Ball ball){
        System.out.println("Shoot the ball");
    }

    public void shoot(Gun gun, Ball...balls){
        for (Ball ball : balls){
            System.out.printf("Shooting %s ball\n", ball);
        }
        System.out.println("Shoot the balls");
    }
}
