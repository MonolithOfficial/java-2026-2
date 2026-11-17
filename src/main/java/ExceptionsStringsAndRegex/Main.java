package ExceptionsStringsAndRegex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args){
//        Throwable throwable = new Throwable();
//        throw throwable;

        // unchecked
//        RuntimeException runtimeException = new RuntimeException()
        int x = 10;
        try {
            int result = 10 / 0;
            //
        }catch (ArithmeticException arithmeticException){
            System.out.println("Try again");
        }


        // checked
//        Exception exception = new Exception();
        exceptionTester();
        try {
            exceptionTester2();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void exceptionTester() {
        try {
            FileReader reader = new FileReader("sometext.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
            throw new RuntimeException(e);
        } finally {
            System.out.println("Connection closed");
        }
    }

    private static void exceptionTester2() throws FileNotFoundException {
        FileReader reader = new FileReader("sometext.txt");
    }
}
