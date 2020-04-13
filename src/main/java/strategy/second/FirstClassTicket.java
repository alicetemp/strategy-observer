package strategy.second;

public class FirstClassTicket implements PriceCalculator {

    @Override
    public double calculate(boolean isNearWindow) {
        return isNearWindow ? START_PRICE+START_PRICE*0.2 + 40 : START_PRICE + 40 ;
    }

}
