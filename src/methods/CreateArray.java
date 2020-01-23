package methods;

import java.util.Random;

public class CreateArray {

    private static boolean debugMode = false;

    public static void setDebugMode(boolean debugMode) {
        CreateArray.debugMode = debugMode;
    }

    public static int[] arrayCreator(int size, int firstElement, int lastElement) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt((lastElement - firstElement) + firstElement);
        }
        if (debugMode == true) {
            PrintResult.printIt(arr);
        }
        return arr;
    }
}
