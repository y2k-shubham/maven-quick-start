package clinic.programming.training;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public Application() {
        System.out.println("Inside Application");
    }

    public void greet() {
        List<String> greetings = new ArrayList<>();
        greetings.add("Hello!");

        for (String greeting : greetings) {
            System.out.println("Greeting: " + greeting);
        }
    }

    public int countWords(String sentence) {
        String[] words = StringUtils.split(sentence, ' ');
        return (words == null) ? 0 : words.length;
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main(String[] args) {
        System.out.println("Starting Application");
        Application app = new Application();

        app.greet();

        int wordCount = app.countWords("I have four words");
        System.out.println("Word Count: " + wordCount);
    }
}
