import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 : ");
        int number1 = scanner.nextInt();
        System.out.println("Enter 2 : ");
        int number2 = scanner.nextInt();
        System.out.println("Enter 3 : ");
        int number3 = scanner.nextInt();
        if ((number1 > number2) && (number1 > number3)) {
            System.out.println("Number 1 is greatest");
        } else
            if ((number2 > number1) && (number2 > number3)) {
            System.out.println("Number 2 is greatest");
        } else {
            System.out.println("Number 3 is greatest");
        }
    }
}


