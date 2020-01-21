package arrays;

import methods.PrintResult;

public class FillWithNumbers {

    PrintResult print = new PrintResult();

    private static boolean debugMode = false;

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

    public void fillOddNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2 + 1;
        }
        if (debugMode == true) {
            print.printIt(arr);
        }
    }

    public void fillEvenNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + i;
        }
        if (debugMode == true) {
            print.printIt(arr);
        }
    }

    public void fillPowTwo(int[] arr) {
        arr[0] = 2;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1] * 2;
        }
        if (debugMode == true) {
            print.printIt(arr);
        }
    }

    public void fillFibonacciNumber (int[] arr) {
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }
        if (debugMode == true) {
            print.printIt(arr);
        }
    }
}