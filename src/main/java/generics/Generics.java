package generics;

import OOP2.Rectangle;
import OOP2.Square;

import java.util.*;

public class Generics {
    public static void main(String[] args) {
        List<String> listOfThings = new ArrayList<>();
        listOfThings.add("Something");
        listOfThings.add("Something2");
        listOfThings.add("Something3");

        List<Integer> listOfInts = new ArrayList<>();

        for (String thing : listOfThings) {
            String result = thing.replace("e", "");
        }

        Iterator<String> iterator = listOfThings.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().replace("a", ""));
        }

        Map<Object, Object> mapOfShapes = new HashMap<>();

        Tuple<String, Rectangle> smallRectangle =
                new Tuple<>("Small Rectangle", new Rectangle(10, 10));
        Tuple<String, Rectangle> bigRectangle =
                new Tuple<>("Big Rectangle", new Rectangle(200, 200));

        Rectangle max =
                Helper.findMax(new Square(10), new Square(20));
    }

}
