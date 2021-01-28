import Algorithms.InsertionSort;
import Algorithms.MergeSort;

import java.security.SecureRandom;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = 10 + random.nextInt(90);
        }
        System.out.println("Insertion Sort");
        System.out.println("Unsorted Array : " + Arrays.toString(array));
        InsertionSort.performSort(array);
        System.out.println("Sorted Array : " + Arrays.toString(array));
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            array[i] = 10 + random.nextInt(90);
        }

        System.out.println("Merge Sort");
        System.out.println("Unsorted Array : " + Arrays.toString(array));
        MergeSort.mergeSort(array, 0, array.length - 1);
        System.out.println("Sorted Array : " + Arrays.toString(array));
        System.out.println();

    }
}
