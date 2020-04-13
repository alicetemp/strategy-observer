package strategy.first;

public class ShellSort implements Sorting {

    @Override
    public int[] sort(int[] input) {
        int increment = input.length / 2;
        while (increment >= 1) {
            for (int startIndex = 0; startIndex < increment; startIndex++) {
                for (int i = startIndex; i < input.length - 1; i = i + increment) {
                    for (int j = Math.min(i + increment, input.length - 1); j - increment >= 0; j = j - increment) {
                        if (input[j - increment] > input[j]) {
                            int tmp = input[j];
                            input[j] = input[j - increment];
                            input[j - increment] = tmp;
                        } else {
                            break;
                        }
                    }
                }
            }
            increment = increment / 2;
        }
        return input;
    }
}
