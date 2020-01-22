import arrays.*;

public class Main {
    public static void main(String[] args) {

        int[] testArray = new int[10];


        FillWithNumbers goFill = new FillWithNumbers();


        goFill.fillOneByOne(testArray);
        goFill.fillPowTwo(testArray);
        goFill.fillOddNumbers(testArray);
        goFill.fillEvenNumbers(testArray);
        goFill.fillFibonacciNumber(testArray);
        goFill.fillSum(testArray);
        goFill.fillGeometricProgression(testArray, 3);
        FillWithNumbers.setDebugMode(true);
        goFill.fillArithmeticProgression(testArray, 3);
    }
}
