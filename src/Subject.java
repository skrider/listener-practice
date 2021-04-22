package src;

public interface Subject<T> {

    void check(T o);
    void addObserver(Observer<T> obs);

}
