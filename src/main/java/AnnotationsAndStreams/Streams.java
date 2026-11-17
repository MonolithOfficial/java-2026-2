package AnnotationsAndStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> listOfWords = new ArrayList<>();
        listOfWords.add("I");
        listOfWords.add("Am");
        listOfWords.add("BAT");
        listOfWords.add("MAN");

//        Stream<String> streamOfWords = listOfWords.stream();
//        listOfWords = streamOfWords.filter(word -> {
//            if (word.contains("a")){
//                return true;
//            }
//            else {
//                return false;
//            }
//        }).toList();

        Predicate<String> wordsFilter = word -> word.contains("A");
//        Stream<String> streamOfWords = listOfWords.stream();
        listOfWords = listOfWords.stream().filter(wordsFilter).toList();

        boolean allMatch = listOfWords.stream().allMatch(wordsFilter); // false
        boolean anyMatch = listOfWords.stream().anyMatch(wordsFilter); // true
        boolean noneMatch = listOfWords.stream().noneMatch(wordsFilter); // false

        // distinct method also helpful;
        System.out.println(listOfWords);

        Consumer<String> addDollarSign = word -> System.out.println(word + "$");
        listOfWords.stream().forEach(addDollarSign);
        listOfWords.stream().parallel().forEach(addDollarSign);


    }

}
