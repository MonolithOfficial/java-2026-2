package AnnotationsAndStreams;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@SuppressWarnings({"unused", "rawtypes", "deprecation"})
public class Annotations {

    public static final String SOME_CONSTANT = "something";

    public static void main(String[] args) {
//        SomeLibrary.oldMethod();
//        int x = 10;
//        List someList = new ArrayList();

        Method[] methods = SomeLibrary.class.getDeclaredMethods();
//        for (Method m : methods){
//            System.out.println(m.getName());
//        }

        List<Method> filteredMethod = Arrays.stream(methods).filter(method -> {
            if (method.isAnnotationPresent(Marked.class)){
//                Marked annotation = method.getAnnotation(Marked.class);
//                int id = annotation.id();
                return true;
            }
            else {
                return false;
            }
        }).toList();

        System.out.println(filteredMethod);
    }

    private static void someMethod(){
        SomeLibrary.oldMethod();
        int x = 10;
        List someList = new ArrayList();
    }
}
