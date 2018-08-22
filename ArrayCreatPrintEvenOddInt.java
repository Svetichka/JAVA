import java.util.Random;

public class ArrayCreatPrintEvenOddInt {
    public static void main(String[] args) {
        int size = 10;
        int[] myArray = new int[size];
        createArray(myArray);
        printArrayToConsole(myArray);

        int evenNumbersCount = countEvenNumbersInArray(myArray);
        int oddNumbersCount = countOddNumbersInArray(myArray);
        System.out.println("Even numbers count = " + evenNumbersCount);
        System.out.println("Odd numbers count = " + oddNumbersCount);
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

    private static int countEvenNumbersInArray(int[] myArray) {
        int evenNumbersCount = 0;
        for (int i = 0; i < myArray.length; i++) {
            int arrayElement = myArray[i];
            if (arrayElement % 2 == 0) {
                evenNumbersCount++;
            }
        }
        return evenNumbersCount;
    }

    private static int countOddNumbersInArray(int[] myArray) {
        int oddNumbersCount = 0;
        for (int i = 0; i < myArray.length; i++) {
            int arrayElement = myArray[i];
            if (arrayElement % 2 != 0) {
                oddNumbersCount++;
            }
        }
        return oddNumbersCount;
    }
}

