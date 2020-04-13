package strategy.second;

public class BusinessClassTicket implements PriceCalculator {

    @Override
    public double calculate(boolean isNearWindow) {
        return isNearWindow ? START_PRICE+START_PRICE*0.2 + 30 : START_PRICE + 30 ;
    }

}
