package strategy.second;

public class HotTicket implements PriceCalculator {

    @Override
    public double calculate(boolean isNearWindow) {
        return isNearWindow ? START_PRICE+START_PRICE*0.2 + 50 : START_PRICE + 50 ;
    }

}
