package arrays;

import methods.PrintResult;

public class FillWithNumbers {
    PrintResult print = new PrintResult();

    static boolean debugMode = false;

    public static void setDebugMode(boolean debugMode) {
        FillWithNumbers.debugMode = debugMode;
    }

    public void fillOneByOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        if (debugMode == true) {
            print.printIt(arr);
        }
    }

    public void fillWithTwo(int[] arr) {
        arr[0] = 2;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1] * 2;
        }
        if (debugMode == true) {
            print.printIt(arr);
        }
    }
}