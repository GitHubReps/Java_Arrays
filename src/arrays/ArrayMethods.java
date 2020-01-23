package arrays;

import methods.PrintResult;

public class ArrayMethods {

    // Declare boolean statement for tests
    private static boolean debugMode = false;
    // Setter
    public static void setDebugMode(boolean debugMode) {
        ArrayMethods.debugMode = debugMode;
    }
    // Each element in this array is increased by one
    public void createAscendingArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        if (debugMode == true) {
            PrintResult.printIt(arr);
        }
    }
    // Each element in this array is odd
    public void createOddNumbersArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2 + 1;
        }
        if (debugMode == true) {
            PrintResult.printIt(arr);
        }
    }
    // Each element in this array is even
    public void createEvenNumbersArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + i;
        }
        if (debugMode == true) {
            PrintResult.printIt(arr);
        }
    }
    // Each element in this array is two base exponented by i
    public void createExponentTwoArray(int[] arr) {
        arr[0] = 2;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1] * 2;
        }
        if (debugMode == true) {
            PrintResult.printIt(arr);
        }
    }
    // This array based on a Fibonacci numbers
    public void createFibonacciNumberArray(int[] arr) {
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }
        if (debugMode == true) {
            PrintResult.printIt(arr);
        }
    }
    // This array sums all previous numbers
    public void createPreviousNumbersSumArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int tmp = 0;
            for (int j = 0; j <= i; j++) {
                tmp = tmp + arr[j];
            }
            arr[i] = tmp;
        }
        if (debugMode == true) {
            PrintResult.printIt(arr);
        }
    }
    // This array based on a geometric progression
    public void createGeometricProgressionArray(int[] arr, int exp) {
        arr[0] = exp;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1] * exp;
        }
        if (debugMode == true) {
            PrintResult.printIt(arr);
        }
    }
    // This array based on an arithmetic progression
    public void createArithmeticProgressionArray(int[] arr, int exp) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = exp * i;
        }
        if (debugMode == true) {
            PrintResult.printIt(arr);
        }
    }
}