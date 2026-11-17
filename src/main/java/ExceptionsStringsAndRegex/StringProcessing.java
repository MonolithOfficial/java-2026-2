package ExceptionsStringsAndRegex;

public class StringProcessing {
    public static void main(String[] args) {
        String text = "something"; // literal initialization
        String text2 = "something";

        String sentence = " I am-the-OMNI /MAN... "; // immutable
        sentence = sentence
                .replace("...", "")
                .replace("-", " ")
                .replace("/", "")
//                .replace(" ", "")
                .stripLeading()
                .stripTrailing();

        // C:\Users\Monolith\IdeaProjects\Java-2026-1\src\main\java\OOP2\Rectangle.java
        // OOP2.Rectangle
        String absolutePath = "C:\\Users\\Monolith\\IdeaProjects\\Java-2026-1\\src\\main\\java\\OOP2\\Rectangle.java";
        String className = absolutePath
                .substring(absolutePath.indexOf("java\\") + 5, absolutePath.indexOf(".java"))
                .replace("\\", ".");

        if (className.contains("\\")){
            System.out.println("WE HAVE FAILED");
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("I");
        stringBuilder.append("AM");
        stringBuilder.append("OMNI");
        stringBuilder.append("MAN");
        String resultString = stringBuilder.toString();

        String omniMan = "I" + "AM" + "OMNI" + "MAN";
        System.out.println(className);
    }
}
