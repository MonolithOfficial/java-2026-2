package OOPIntro;

public class Main {
    static String message = "MESSAGE";

    public static void main(String[] args) {
////        int number; // declaration
////        Integer number2;
////        boolean bool;
////        Boolean bool2;
////        number = 10;
////
////        char character = 'a'; // ascii table
////        String str = "something";
////        char[] chars = str.toCharArray();
//
//        int x = 0;
//        while (x < 10){
//            System.out.println(x);
//
//            x++;
//        }
//
//        for (int i = 0; i < 10; i++){
//            System.out.println(i);
//        }
//
//        int[] numbers = new int[]{10, 2, 3, 4};
//        for (int number : numbers){
//            System.out.println(number);
//        }
//
//        for (int i = 0; i < numbers.length; i++){
//            if (i == 2){
//                System.out.println("INDEX PRINTED");
//            }
//        }
//
//        int j = 15;
//        do {
//            System.out.println(j);
//        } while (j < 10);
//
//        if (j == 15){
//            System.out.println("JS IS 15");
//        } else if (j == 10) {
//            System.out.println("J IS 10");
//        } else {
//            System.out.println("SOMETHING ELSE");
//        }

//        Integer result = something("message");

        // OOP
        Car mercedes = new Car("white", 5.0, "Mercedes", "E Class", "10000");
        System.out.println(mercedes);
        Car bmw = new Car("black", 4.4, "BMW", "650", "10000");
        System.out.println(mercedes.equals(bmw));

        mercedes.setColor("white");
        System.out.println(mercedes.getColor());
        mercedes.setPrice("20000");
        mercedes.setEngineDisplacement(5.0);
        mercedes.setMaker("Mercedes");
        mercedes.setModel("E Class");

        Car.drive(mercedes);
    }

    private static String something(String message){
//        number = 10;
        System.out.println(message);
        return message;
    }
}
