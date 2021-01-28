package Algorithms;

public class MergeSort {

    public static void mergeSort(int[] data, int lowestIndex, int highestIndex) {
        if (lowestIndex < highestIndex) {
            int middleIndex = (lowestIndex + highestIndex) / 2;
            mergeSort(data, lowestIndex, middleIndex);
            mergeSort(data, middleIndex + 1, highestIndex);
            merge(data, lowestIndex, middleIndex, highestIndex);
        }

    }

    private static void merge(int[] array, int lowestIndex, int middleIndex, int highestIndex) {
        // Creating temporary sub Arrays
        int[] leftArray = new int[middleIndex - lowestIndex + 1];
        int[] rightArray = new int[highestIndex - middleIndex];

        // Copying our sub Arrays into temporaries
        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = array[lowestIndex + i];
        }

        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = array[middleIndex + i + 1];
        }

        // Iterators containing current index of temp sub Arrays
        int leftIndex = 0;
        int rightIndex = 0;

        // Copying from leftArray and rightArray back into array
        for (int i = lowestIndex; i < highestIndex + 1; i++) {
            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArray.length) {
                array[i] = leftArray[leftIndex];
            } else if (rightIndex < rightArray.length) {
                array[i] = rightArray[rightIndex];
            }
        }
    }

}
