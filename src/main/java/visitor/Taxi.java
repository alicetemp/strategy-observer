package visitor;

public class Taxi implements Visitor {

    @Override
    public void visit(Customer element) {
        System.out.println("Taxi visiting the customer!");
    }

    @Override
    public void visit(Endpoint element) {
        System.out.println("Taxi visiting the endpoint!");
    }
}
