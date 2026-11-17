package generics;

public class Helper {
    public static <T extends Comparable<T>> T findMax(T element1, T element2){
        return element1.compareTo(element2) > 0 ? element1 : element2;
    }
}
