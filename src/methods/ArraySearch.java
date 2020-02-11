package methods;

public class ArraySearch {
    public static int binarySearch(int[] arr, int guess) {
        int minValue = arr[0];
        int maxValue = arr.length - 1;
        while (minValue <= maxValue) {
            int midValue = (minValue + maxValue) / 2;
            if (guess > midValue && (guess > arr[0]) && (guess < (arr.length - 1) )) {
                minValue = midValue + 1;
            }
            else if (guess < midValue && (guess > arr[0]) && (guess < (arr.length - 1) )) {
                maxValue = midValue - 1;
            }

            else if (guess == midValue) {
                break;
            }
            else {
                System.out.printf("No such value as %d\n", guess);
                break;
            }
        }
        return guess;
    }
}
