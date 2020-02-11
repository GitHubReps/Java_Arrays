package methods;

public class ArraySearch {

    public static int binarySearch(int[] arr, int guess) {
        int minValue = arr[0];
        int maxValue = arr[arr.length - 1];
        while (minValue <= maxValue) {
            int midValue = (minValue + maxValue) / 2;
            if (guess < arr[0] || guess > arr[arr.length - 1]) {
                throw new NullPointerException("There is no such element!");
            }

            else if (guess == midValue) {
                return guess;
            }

            else if (guess > midValue) {
                minValue = midValue + 1;
            }
            else if (guess < midValue) {
                maxValue = midValue - 1;
            }
        }
        return guess;
    }
}