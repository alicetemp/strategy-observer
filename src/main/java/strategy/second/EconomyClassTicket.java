package strategy.second;

public class EconomyClassTicket implements PriceCalculator {

    @Override
    public double calculate(boolean isNearWindow) {
        return isNearWindow ? START_PRICE+START_PRICE*0.2 + 20 : START_PRICE + 20 ;
    }
}
