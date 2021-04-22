package src;

public class Exiter implements Observer<String> {

    @Override
    public void notify(String s) {
        System.exit(0);
    }
}
