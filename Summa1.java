import java.util.Scanner;
public class Summa1 {
    public static void main(String[] args) {
        System.out.println("Enter first integer number: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Enter second integer number: ");
        int b = scanner.nextInt();
        if (a < b) {
            int sum = a + b;
            System.out.println("sum =  " + sum);
        } else{
            System.out.println("sum is not present");
        }
    }
}
