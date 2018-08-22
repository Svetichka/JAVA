import java.util.Random;

public class ArrayCreatPrintSumInt {

    public static void main(String[] args) {
        int size = 10;
        int[] myArray = new int[size];
        createArray(myArray);
        printArrayToConsole(myArray);
        int arraySum = calculateArraySum(myArray);
        System.out.print("Sum = " + arraySum);
    }

    private static int[] createArray(int[] myArray) {
        Random randomGenerator = new Random();
        for (int size = 0; size < myArray.length; size++) {
            int randomNumber = randomGenerator.nextInt(2);
            myArray[size] = randomNumber;
        }
        return myArray;
    }


    private static void printArrayToConsole(int[] myArray) {
        System.out.print(myArray);
        System.out.println();
    }

  //  private static void printArrayToConsole(int[] myArray) {
    //    System.out.println("Print array to console: ");
     //   for (int i = 0; i < myArray.length; i++) {
     //       System.out.print(myArray[i] + " ");
      //  }
     //   System.out.println();
  //  }

    private static int calculateArraySum(int[] myArray) {
        int arraySum = 0;
        for (int i = 0; i < myArray.length; i++) {
            arraySum = arraySum + myArray[i];
        }
        return  arraySum;
    }
}

