import java.util.Random;

 public class ArrayCreatPrintSort {
     // обьявление константы - длинна массива
     private static final int ARRAY_SIZE = 10;

     // обьявление константы - максимальное рандомное число
     private static final int MAX_RANDOM_NUMBER = 100;

     public static void main(String[] args) {
         int[] myArray = new int[ARRAY_SIZE];

         fillArrayWithRandomNumbers(myArray);

         printArrayToConsole(myArray);

         sorting(myArray);

         printArrayToConsole(myArray);

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




