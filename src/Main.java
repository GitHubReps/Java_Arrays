import arrays.*;
import methods.PrintResult;

public class Main {
    public static void main(String[] args) {

        int[] testArray = new int[25];

        FillWithNumbers.setDebugMode(true);
        FillWithNumbers goFill = new FillWithNumbers();

        goFill.fillOneByOne(testArray);
        goFill.fillWithTwo(testArray);
    }
}
