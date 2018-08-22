import java.util.Random;

public class ArrayCreatPrintMaxInt {
    public static void main(String[] args) {
        int size = 10;
        int[] myArray = new int[size];
        createArray(myArray);
        printArrayToConsole(myArray);
       int  maxMyArray = findMaxArray(myArray);
        System.out.print("MAX = " + maxMyArray);
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

    private static int findMaxArray(int[] myArray) {
        int maxMyArray = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > maxMyArray) {
                maxMyArray = myArray[i];

            }
        }
        return maxMyArray;

    }
}

