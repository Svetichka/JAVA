import java.util.Random;
import java.util.Scanner;
public class SecretNumber {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int thoughtNumber = randomGenerator.nextInt(101)+1;
        int enteredNumber = 0;

        while(enteredNumber != thoughtNumber){
            System.out.println("Введите число ");
            Scanner scanner = new Scanner(System.in);
            enteredNumber = scanner.nextInt();
            if (enteredNumber > thoughtNumber){
                System.out.println("введенное число > загаданного");
            }
            if (enteredNumber < thoughtNumber){
                System.out.println("введенное число < загаданного");
            }
            if (enteredNumber == thoughtNumber){
                System.out.println("введенное число = загаданное");
            }
        }
    }
}
