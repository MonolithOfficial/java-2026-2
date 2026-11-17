package AnnotationsAndStreams;

public class SomeLibrary {
    @Deprecated(since = "1.0.1")
    public static void oldMethod(){
        System.out.println("IM OLD...");
    }

    public static void newMethod(){
        System.out.println("IM OLD...");
    }

    @Marked(id = 1, title = "Some method")
    public static void someMethod1(){
        System.out.println("1");
    }

    @Marked(id = 2, title = "Some method 2")
    public static void someMethod2(){
        System.out.println("2");
    }

    @Marked(id = 3)
    public static void someMethod3(){
        System.out.println("3");
    }

    @Marked(id = 4)
    public static void someMethod4(){
        System.out.println("4");
    }

    public static void someMethod5(){
        System.out.println("5");
    }
}
