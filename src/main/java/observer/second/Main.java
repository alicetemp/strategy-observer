package observer.second;

public class Main {

    public static void main(String[] args) {

        Subject subject = new Subject();

        Bin bin = new Bin(subject);
        Oct oct = new Oct(subject);
        Dec dec = new Dec(subject);
        Hex hex = new Hex(subject);

        subject.setNumber("446452");
        System.out.println();
        subject.setNumber("453688");
        System.out.println();
        subject.setNumber("124327");
    }

}
