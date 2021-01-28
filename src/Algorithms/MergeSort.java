package Algorithms;

public class MergeSort {

    public static void sortArray(int[] data, int lowestIndex, int highestIndex) {
        if (lowestIndex < highestIndex) {
            //get the index of the element in the middle
            int middleIndex = lowestIndex + (highestIndex - lowestIndex) / 2;
            int middleIndexPlusOne = middleIndex + 1;
            //sort left side of array
            sortArray(data, lowestIndex, middleIndex);
            //sort right side of the array
            sortArray(data, middleIndexPlusOne, highestIndex);
            //combine both halves
            merge(data, lowestIndex, middleIndex, middleIndexPlusOne, highestIndex);
        }

    }

    private static void merge(int[] data, int lowestIndex, int middleIndex, int middleIndexPlusOne, int highestIndex) {
        int leftIndex = lowestIndex;
        int rightIndex = middleIndexPlusOne;
        int combinedIndex = lowestIndex;
        int[] combined = new int[data.length];

    }
}
