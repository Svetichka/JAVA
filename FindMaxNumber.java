import java.util.Scanner;

public class FindMaxNumber {
    public static void main(String[] args) {
        int[] userInput = new int[10];
        int maxNumber = -1;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < userInput.length; i++) {
            System.out.println("Enter number: ");
            userInput[i] = scanner.nextInt();
        }
        for (int i = 0; i < userInput.length; i++) {
            System.out.println(userInput[i]);
        }
         maxNumber = userInput[0];
        for (int i = 0; i < userInput.length; i++) {
            if (userInput[i] > maxNumber) {
                maxNumber = userInput[i];
            }
        }
        System.out.println("Thank you!");
        System.out.println();
        System.out.println("Max number: " + maxNumber);
    }
}

