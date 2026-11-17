package ExceptionsStringsAndRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String text = "I AM OMNI MAN AND MY PHONE NUMBER IS 558199557 AND 558123123";
        String regex = "((558)(\\d{6}))";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

//        if (matcher.find()){
//            System.out.println("TEXT CONTAINS A PHONE NUMBER");
//            System.out.println(matcher.group(0));
//            System.out.println(matcher.group(1));
//            System.out.println(matcher.group(2));
//            System.out.println(matcher.group(3));
//        }

        while (matcher.find()){
            System.out.println("TEXT CONTAINS A PHONE NUMBER");
            System.out.println(matcher.group(0));
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(matcher.group(3));
        }
    }
}
