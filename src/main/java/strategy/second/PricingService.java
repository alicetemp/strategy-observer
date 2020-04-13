package strategy.second;

public class PricingService {

    private PriceCalculator priceCalculator;

    public void setPriceCalculator(PriceCalculator priceCalculator) {
        this.priceCalculator = priceCalculator;
    }

    public double calculate(boolean isNearWindow) {
        return priceCalculator.calculate(isNearWindow);
    }

}
