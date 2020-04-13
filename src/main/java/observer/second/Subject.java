package observer.second;

import java.util.LinkedList;
import java.util.List;

public class Subject implements Observable {

    private List<Observer> observers;
    private String number;

    public Subject() {
        observers = new LinkedList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers)
            observer.update(number);
    }

    public void setNumber(String number) {
        this.number = number;
        notifyObservers();
    }

}
