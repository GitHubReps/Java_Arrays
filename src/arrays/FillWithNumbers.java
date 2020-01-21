package arrays;

import methods.PrintResult;

public class FillWithNumbers {
    PrintResult print = new PrintResult();

    public void fillOneByOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        print.printIt(arr);
    }

    public void fillWithTwo(int[] arr) {
        arr[0] = 2;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1] * 2;
        }
        print.printIt(arr);
    }
}