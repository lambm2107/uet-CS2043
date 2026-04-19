import java.util.Arrays;

public class LegacySorter {
    public int[] quickSort(int[] arr) {
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);
        return sortedArr;
    }
}
