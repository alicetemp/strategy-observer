package strategy.second;

public interface PriceCalculator {

    double START_PRICE = 100;
    double calculate(boolean isNearWindow);
}
