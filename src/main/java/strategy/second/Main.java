package strategy.second;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PricingService pricingService = new PricingService();

        System.out.println("Select ticket type:\n 1-Economy,\n 2-Business,\n 3-Firs,\n 4-<Hot>");
        Scanner scanner = new Scanner(System.in);
        String ticketType = scanner.nextLine();
        System.out.println("Seat near window:\n 1-true,\n 2-false");
        boolean isNearWindow = scanner.nextLine().equals("1") ? true : false;
        scanner.close();

        switch (ticketType) {
            case "2":
                pricingService.setPriceCalculator(new BusinessClassTicket());
                break;
            case "3":
                pricingService.setPriceCalculator(new FirstClassTicket());
                break;
            case "4":
                pricingService.setPriceCalculator(new HotTicket());
                break;
            case "1":
            default:
                pricingService.setPriceCalculator(new EconomyClassTicket());
                break;
        }

        double price = pricingService.calculate(isNearWindow);
        System.out.println("Ticket price: " + price + "$");

    }

}
