package strategy.first;

public class SortingService {

    private Sorting sorting;

    public void setSorting(Sorting sorting) {
        this.sorting = sorting;
    }

    public int[] sort(int[] input) {
        sorting.sort(input);
        return input;
    }

}
