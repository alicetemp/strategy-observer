package observer.first;

public class Main {

    public static void main(String[] args) {

        Auctioneer auctioneer = new Auctioneer();

        Bidder bidder1 = new Bidder(auctioneer, 1);
        Bidder bidder2 = new Bidder(auctioneer, 2);
        Bidder bidder3 = new Bidder(auctioneer, 3);
        auctioneer.setRate(29f);
        auctioneer.setRate(39f);
        auctioneer.setRate(42f);
    }

}
