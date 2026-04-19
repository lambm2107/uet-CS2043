public class ArrayUtils {
    public static <T> void swap(T[] arr, int i, int j) {
        T tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1].compareTo(arr[j]) > 0)
                    swap(arr, j - 1, j);
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr1 = new Integer[]{5, 1, 3, 2};
        String[] arr2 = new String[]{"Java", "C++", "Python"};
        bubbleSort(arr1);
        bubbleSort(arr2);
        for (Integer i: arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (String i: arr2) {
            System.out.print(i + " ");
        }
//        System.out.println(java.util.Arrays.toString(arr1));
//        System.out.println(java.util.Arrays.toString(arr2));
    }
}
