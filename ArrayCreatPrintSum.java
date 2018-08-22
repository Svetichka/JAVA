import java.util.Random;

public class ArrayCreatPrintSum {
    // обьявление константы - длинна массива
    private static final int ARRAY_SIZE = 10;

    // обьявление константы - максимальное рандомное число
    private static final int MAX_RANDOM_NUMBER = 100;

    public static void main(String[] args) {
        int[] myArray = new int[ARRAY_SIZE];

        fillArrayWithRandomNumbers(myArray);

        printArrayToConsole(myArray);

        int arraySum = calculateArraySum(myArray);
        System.out.println("myArray sum = " + arraySum);

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

    private static int calculateArraySum(int[] myArray) {
        int arraySum = 0;
        for (int i = 0; i < myArray.length; i++) {
            arraySum = arraySum + myArray[i];
        }
        return arraySum;
    }
}

