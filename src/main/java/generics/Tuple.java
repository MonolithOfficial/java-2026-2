package generics;

import OOP2.Figure;

public class Tuple<E, T extends Figure> {
   private E elementOne;
   private T elementTwo;

    public Tuple(E elementOne, T elementTwo) {
        this.elementOne = elementOne;
        this.elementTwo = elementTwo;
    }

    public E getElementOne() {
        return elementOne;
    }

    public T getElementTwo() {
        return elementTwo;
    }
}
