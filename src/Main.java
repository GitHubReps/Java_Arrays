import arrays.*;
import methods.*;

public class Main {
    public static void main(String[] args) {

        createRandomArray.setDebugMode(false);

//      int[] testArray = createRandomArray.arrayCreator(20, 5, 1000);
        int[] testArray = new int[100];

        ArrayMethods fillArray = new ArrayMethods();

        ArrayMethods.setDebugMode(true);
        fillArray.createAscendingArray(testArray);
        /*
        ArrayMethods.setDebugMode(false);
        fillArray.createExponentTwoArray(testArray);
        fillArray.createOddNumbersArray(testArray);
        fillArray.createEvenNumbersArray(testArray);
        fillArray.createFibonacciNumberArray(testArray);
        fillArray.createPreviousNumbersSumArray(testArray);
        fillArray.createGeometricProgressionArray(testArray, 3);
        fillArray.createArithmeticProgressionArray(testArray, 3); */
        ArraySearch arraySearch = new ArraySearch();
        int answer = arraySearch.binarySearch(testArray, 100);
        System.out.printf("Element %d found", answer);
    }
}