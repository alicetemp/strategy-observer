package strategy.first;

public class BubbleSort implements Sorting {

    @Override
    public int[] sort(int[] input) {
        int i = 0, n = input.length;
        boolean swapNeeded = true;
        while (i < n - 1 && swapNeeded) {
            swapNeeded = false;
            for (int j = 1; j < n - i; j++) {
                if (input[j - 1] > input[j]) {
                    int temp = input[j - 1];
                    input[j - 1] = input[j];
                    input[j] = temp;
                    swapNeeded = true;
                }
            }
            if(!swapNeeded) {
                break;
            }
            i++;
        }
        return input;
    }


}
