
import java.util.Random;

public class ArrayCreatPrintEvenOdd {
    // обьявление константы - длинна массива
    private static final int ARRAY_SIZE = 10;

    // обьявление константы - максимальное рандомное число
    private static final int MAX_RANDOM_NUMBER = 100;

    public static void main(String[] args) {
        int[] myArray = new int[ARRAY_SIZE];

        fillArrayWithRandomNumbers(myArray);

        printArrayToConsole(myArray);

        countEvenNumbersInArray(myArray);

        countOddNumbersInArray(myArray);

        int evenNumbersCount = countEvenNumbersInArray(myArray);
        int oddNumbersCount = countOddNumbersInArray(myArray);
        System.out.println("Even numbers count = " + evenNumbersCount);
        System.out.println("Odd numbers count = " + oddNumbersCount);
    }

    private static void fillArrayWithRandomNumbers(int[] myArray) {
        Random randomGenerator = new Random();
        for (int i = 0; i < myArray.length; i++) {
            int randomNumber = randomGenerator.nextInt(MAX_RANDOM_NUMBER);
            myArray[i] = randomNumber;
        }
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




