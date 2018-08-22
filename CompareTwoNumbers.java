import java.util.Scanner;

public class CompareTwoNumbers {
    public static void main(String[] args) {

        int number1 = getNumberFromUser();
        int number2 = getNumberFromUser();

        int maxNumber = findMaxNumber(number1, number2);
        if (number2 != number1) {
            printMessageToConsole("Max number: " + maxNumber);
        } else {
            printMessageToConsole("A==B== " + maxNumber);
        }
    }


    private static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number : ");
        return scanner.nextInt();
    }

    private static int findMaxNumber(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        }else{
            return number2;
        }

    }

    private static void printMessageToConsole(String message) {
        System.out.println(message);
    }
}