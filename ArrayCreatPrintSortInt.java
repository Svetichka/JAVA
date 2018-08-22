import java.util.Random;

public class ArrayCreatPrintSortInt {
    public static void main(String[] args) {
        int size = 10;
        int[] myArray = new int[size];
        createArray(myArray);
        printArrayToConsole(myArray);
        sorting(myArray);
        printArrayToConsole(myArray);
    }

    private static int[] createArray(int[] myArray) {
        Random randomGenerator = new Random();
        for (int size = 0; size < myArray.length; size++) {
            int randomNumber = randomGenerator.nextInt(5);
            myArray[size] = randomNumber;
        }
        return myArray;
    }

    private static void printArrayToConsole(int[] myArray) {
        System.out.println("Print array to console: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
    }

    private static void sorting(int[] myArray) {
        for (int i = myArray.length - 1; i > 0; i--) {
            for (int k = 0; k < i; k++) {

                if (myArray[k] > myArray[k + 1]) {
                    int sohr = myArray[k];
                    myArray[k] = myArray[k + 1];
                    myArray[k + 1] = sohr;
                }
            }
        }
    }
}


