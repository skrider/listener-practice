package src;

import java.util.ArrayList;

//Watches for a char c being typed and then calls its observers
public class KeyWatcher implements Subject {
    private char c;
    private ArrayList<Observer> subscribers;

    public KeyWatcher(char c) {
        this.c = c;
        subscribers = new ArrayList<>();
    }
    
    @Override
    public

}
