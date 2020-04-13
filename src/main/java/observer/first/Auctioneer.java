package observer.first;

import java.util.LinkedList;
import java.util.List;

public class Auctioneer implements Observable {

    private List<Observer> observers;
    private float rate;

    public Auctioneer() {
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
            observer.update(rate);
    }

    public void setRate(float rate) {
        this.rate = rate;
        notifyObservers();
    }

}
