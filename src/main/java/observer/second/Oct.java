package observer.second;

public class Oct implements Observer {

    private String number;
    private Subject subject;

    public Oct(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String number) {
        this.number = convert(number);
        display();
    }

    public void display() {
        System.out.println("Oct number:" + number);
    }

    private String convert(String number) {
        Integer n = Integer.valueOf(number);
        return Integer.toOctalString(n);
    }

}
