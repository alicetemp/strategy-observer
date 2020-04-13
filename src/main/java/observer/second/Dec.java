package observer.second;

public class Dec implements Observer {

    private String number;
    private Subject subject;

    public Dec(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String number) {
        this.number = number;
        display();
    }

    public void display() {
        System.out.println("Dec number:" + number);
    }

}
