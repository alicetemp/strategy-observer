package observer.first;

public class Bidder implements Observer {

    private int id;
    private float rate;
    private Auctioneer auctioneer;

    public Bidder(Auctioneer auctioneer, int id) {
        this.id = id;
        this.auctioneer = auctioneer;
        auctioneer.registerObserver(this);
    }

    @Override
    public void update(float rate) {
        this.rate = rate;
        display();
    }

    public void display() {
        System.out.println("Current rate:" + rate + " Bidder_" + id);
    }

}
