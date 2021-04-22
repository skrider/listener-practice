package src;

import java.util.regex.Pattern;

public class WordListener implements Observer<String> {
    private static final Pattern replacer = Pattern.compile("(?<!\\\\)\\$m\\$");

    private String message;

    public WordListener(String message) {
        this.message = message;
    }

    @Override
    public void notify(String s) {
        System.out.println(message.replaceAll(replacer.toString(), s));
    }

}
