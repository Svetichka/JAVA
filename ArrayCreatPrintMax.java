
import java.util.Random;

public class ArrayCreatPrintMax {
    // обьявление константы - длинна массива
    private static final int ARRAY_SIZE = 10;

    // обьявление константы - максимальное рандомное число
    private static final int MAX_RANDOM_NUMBER = 100;

    public static void main(String[] args) {
        int[] myArray = new int[ARRAY_SIZE];
        int maxMyArray = 0;
        fillArrayWithRandomNumbers(myArray);

        printArrayToConsole(myArray);

        findMaxArray(myArray);

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

    private static int findMaxArray(int[] myArray) {
        int maxMyArray = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > maxMyArray) {
                maxMyArray = myArray[i];

            }
        }
        System.out.print("MAX = " + maxMyArray);
        return maxMyArray;

    }

}








