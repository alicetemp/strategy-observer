package strategy.first;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        SortingService sortingService = new SortingService();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter algorithm name:");
        String algorithm = scanner.nextLine();
        System.out.println("Enter array size:");
        String size = scanner.nextLine();

        scanner.close();

        int[] array = new Random().ints(Integer.valueOf(size), 10, 30).toArray();
        System.out.println(Arrays.toString(array));

        switch (algorithm) {
            case "shell":
                sortingService.setSorting(new ShellSort());
                break;
            case "merge":
                sortingService.setSorting(new MergeSort());
                break;
            case "bubble":
            default:
                sortingService.setSorting(new BubbleSort());
                break;
        }

        sortingService.sort(array);
        System.out.println(Arrays.toString(array) + "\n");

    }

}
