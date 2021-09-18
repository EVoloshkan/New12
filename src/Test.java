import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String a = "I like Java!!!";
        boolean contains = a.contains("Java");
        boolean startWith = a.startsWith("I like");
        boolean endWith = a.endsWith("!!!");
        String replaceA = a.replace('a', 'o');
        System.out.println(contains);
        System.out.println(startWith);
        System.out.println(endWith);
        if (contains && startWith && endWith) {
            System.out.println(a.toUpperCase());
        } else {
            System.out.println("");
        }
        int index = replaceA.indexOf("Jovo");
        if (index == -1) {
            System.out.println("Не содержит Jovo");
        } else {
            System.out.println(replaceA.substring(index, index + "Jovo".length()));
        }
    }
}
