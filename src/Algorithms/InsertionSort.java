package Algorithms;

public class InsertionSort {
    public static void performSort(int[] data) {

        for (int currentIndex = 1; currentIndex < data.length; currentIndex++) {
            int insertValue = data[currentIndex];
            int moveIndex = currentIndex;

            while (moveIndex > 0 && data[moveIndex - 1] > insertValue)
            {
                data[moveIndex] = data[moveIndex - 1];
                moveIndex--;
            }
            data[moveIndex] = insertValue;
        }

    }
}
