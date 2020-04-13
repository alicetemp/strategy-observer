package visitor;

public class Endpoint implements Element {

    @Override
    public void accept(Visitor visitor) {
        System.out.println("Endpoint is accepting visitor.");
        visitor.visit(this);
    }
}
