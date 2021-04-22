package src;

import java.util.Objects;

public class WordWatcher extends StringWatcher implements Observer<String> {

    public WordWatcher(String target) {
        old = Objects.requireNonNullElse(target, "");
    }

    @Override
    public void check(String s) {
        if (old.equals(s)) {
            updateAll(old);
        }
    }

    @Override
    public void notify(String s) {
        check(s);
    }

}
