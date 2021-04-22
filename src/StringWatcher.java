package src;

import java.util.ArrayList;

//Watches for an update in a string and calls its observers if one is detected
public class StringWatcher implements Subject<String> {
    protected String old;
    protected ArrayList<Observer<String>> subscribers;

    public StringWatcher() {
        subscribers = new ArrayList<>();
    }

    @Override
    public void check(String newer) {
        if (!newer.equals(old)) {
            updateAll(newer);
        }
        old = newer;
    }

    protected void updateAll(String message) {
        for (Observer<String> obs : subscribers) {
            obs.notify(message);
        }
    }

    @Override
    public void addObserver(Observer<String> o) {
        subscribers.add(o);
    }
}
