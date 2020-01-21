package methods;

public class PrintResult {
    public void printIt(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index: " + i + " Value: " + arr[i]);
        }
        System.out.println("");
    }
}
