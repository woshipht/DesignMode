package 观察者模式;

import java.util.ArrayList;
import java.util.List;

abstract class Subject {
    protected List<Observer> observers = new ArrayList<>();

    public void add(Observer observer){
        observers.add(observer);
    }

    public void remove(Observer observer){
        observers.remove(observer);
    }

    public abstract void notifyAllObserver();
}
