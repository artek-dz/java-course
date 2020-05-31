package assign10;

import java.util.function.Function;

public class LambdaTester {

    public static void main(String[] args) {

        String originalText = "This is a test text.";

        String modifiedText = modifyString(originalText, String::toUpperCase);
        System.out.println(modifiedText);

        modifiedText = modifyString(originalText, String::toLowerCase);
        System.out.println(modifiedText);

        modifiedText = modifyString(originalText, text -> String.valueOf(text.charAt(0)));
        System.out.println(modifiedText);

        modifiedText = modifyString(originalText, text -> String.valueOf(text.charAt(text.length() - 1)));
        System.out.println(modifiedText);

        Integer intProperty = getIntProperty(originalText, String::length);
        System.out.println(intProperty);

        intProperty = getIntProperty(originalText, text -> text.split(" ").length);
        System.out.println(intProperty);
    }

    private static String modifyString(String text, Function<String, String> modifier) {
        return modifier.apply(text);
    }

    private static Integer getIntProperty(String text, Function<String, Integer> function) {
        return function.apply(text);
    }
}
