package observer.second;

public class Hex implements Observer{

    private String number;
    private Subject subject;

    public Hex(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String number) {
        this.number = convert(number);
        display();
    }

    public void display() {
        System.out.println("Hex number:" + number);
    }

    private String convert(String number) {
        Integer n = Integer.valueOf(number);
        return Integer.toHexString(n);
    }

}
