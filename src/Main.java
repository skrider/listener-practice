package src;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)
        throws IOException
    {
        Console c = System.console();

        StringWatcher watcher = new StringWatcher();

        WordWatcher hello = new WordWatcher("hello");
        watcher.addObserver(hello);
        WordWatcher goodbye = new WordWatcher("goodbye");
        watcher.addObserver(goodbye);
        WordWatcher echo = new WordWatcher("echo");
        watcher.addObserver(echo);

        WordListener salut = new WordListener("Hello there!");
        hello.addObserver(salut);
        WordListener wiedersehen = new WordListener("See you");
        goodbye.addObserver(wiedersehen);
        WordListener repeater = new WordListener("Echoing $m$");
        echo.addObserver(repeater);

        Exiter exit = new Exiter();
        goodbye.addObserver(exit);

        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        while (true) {
            // Reading data using readLine
            watcher.check(reader.readLine());
        }
    }
}