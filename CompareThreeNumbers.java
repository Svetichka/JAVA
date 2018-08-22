import java.util.Scanner;

public class CompareThreeNumbers{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = getNumberFromUser();
        int number2 = getNumberFromUser();
        int number3 = getNumberFromUser();

        int maxNumber = findMaxNumber(number1, number2, number3);
        if ((number1 == number2) && (number2 == number3)) {
            printMessageToConsole("A==B==C " + maxNumber);
        } else {
            printMessageToConsole("Max number: " + maxNumber);
        }
    }

    private static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number : ");
        return scanner.nextInt();
    }

    private static int findMaxNumber(int number1, int number2, int number3) {
        if ((number1 > number2) && (number1 > number3)) {
            return number1;
        }
        if ((number2 > number1) && (number2 > number3)) {
            return number2;
        }
        if ((number3 > number1) && (number3 > number2)) {
            return number3;
        }
        return number1;
    }

    private static void printMessageToConsole(String message) {
        System.out.println(message);
    }

}