package visitor;

public class Main {

    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Customer customer = new Customer();
        Endpoint endpoint = new Endpoint();
        customer.accept(taxi);
        endpoint.accept(taxi);
    }

}
