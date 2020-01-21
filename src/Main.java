import arrays.*;
import methods.PrintResult;

public class Main {
    public static void main(String[] args) {
        int[] testArray = new int[25];
        FillWithNumbers goOne = new FillWithNumbers();
        goOne.fillOneByOne(testArray);
        FillWithNumbers goTwo = new FillWithNumbers();
        goTwo.fillWithTwo(testArray);
    }
}
