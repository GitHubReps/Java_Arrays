public class Main {
    public static void main(String[] args) {
        int someArray[] = new int[10];
        for (int i = 0; i < someArray.length; i++) {
            someArray[i] += i + 1;
            System.out.println("Index: " + i + " Value: " + someArray[i]);
        }
    }
}
