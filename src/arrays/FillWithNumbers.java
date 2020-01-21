package arrays;

import methods.PrintResult;

public class FillWithNumbers {
    private int[] testArray = new int[10];
    PrintResult print = new PrintResult();

    public void fillOneByOne() {
        int testArray[] = new int[10];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = i + 1;
        }
        print.printIt(testArray);
    }

    public void fillWithTwo() {
        testArray[0] = 2;
        for (int i = 1; i < testArray.length; i++) {
            testArray[i] = testArray[i-1] * 2;
        }
        print.printIt(testArray);
    }
}