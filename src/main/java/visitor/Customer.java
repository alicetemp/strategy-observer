package visitor;

public class Customer implements Element {

    @Override
    public void accept(Visitor visitor) {
        System.out.println("Customer is accepting visitor.");
        visitor.visit(this);
    }
}
