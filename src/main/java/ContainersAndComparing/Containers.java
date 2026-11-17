package ContainersAndComparing;

import OOP2.Square;

import java.util.*;

public class Containers {
    public static void main(String[] args) {
        List listOfThings = new ArrayList();
        Integer[] integers = new Integer[]{1,2,3};
//        integers[3] = 10;

        System.out.println(listOfThings.size());
        listOfThings.add(10);
        System.out.println(listOfThings.size());
        listOfThings.add(20);
        listOfThings.add(20);
        System.out.println(listOfThings.size());
        System.out.println(listOfThings.indexOf(20));


        Set setOfThings = new HashSet();
        setOfThings.add("something");
        setOfThings.add("and");
        setOfThings.add("something");

        System.out.println(setOfThings);

//        listOfThings.get(10);

        Map mapOfThings = new LinkedHashMap();
        // key -> value
        mapOfThings.put(1, "Some sentence");
        mapOfThings.put(2, "Some sentence 2");
        mapOfThings.put(3, "Some sentence 3");
        mapOfThings.put(1, "Some sentence overwritten");

        for (Object key : mapOfThings.keySet()){
            System.out.println(mapOfThings.get(key));
        }

        for (Object element : listOfThings){
            System.out.println(element);
        }

        Iterator iter = listOfThings.iterator();
        // ResultSet
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        HashSet<Square> setOfSquares = new HashSet<>();
        setOfSquares.add(new Square(10));
        setOfSquares.add(new Square(10));
        setOfSquares.add(new Square(10));

        TreeSet<Square> setOfSquares2 = new TreeSet<>(new SquareComparator());
        // 0.13.2, 10.1
        setOfSquares2.add(new Square(10));
        setOfSquares2.add(new Square(15));
        setOfSquares2.add(new Square(10));

        System.out.println(setOfSquares2.size());

        Map<Square, String> mapOfSquares = new TreeMap<>(new SquareComparator());
        mapOfSquares.put(new Square(25), "Square with 25 area");
        mapOfSquares.put(new Square(30), "Square with 30 area");
        mapOfSquares.put(new Square(25), "Square with 25 area #2");


        List<Square> listOfSquare = new ArrayList<>();
        listOfSquare.add(new Square(1));
        listOfSquare.add(new Square(5));
        listOfSquare.add(new Square(3));
        listOfSquare.add(new Square(4));
        listOfSquare.add(new Square(9));
        System.out.println("UNSORTED: " + listOfSquare);
        Collections.sort(listOfSquare, new SquareComparator());
        System.out.println("SORTED: " + listOfSquare);
        listOfSquare.sort(new SquareComparator());

        Collections.binarySearch(listOfSquare, new Square(1), new SquareComparator());
//        listOfThings.remove(1);
//        System.out.println(listOfThings.size());
    }
}
