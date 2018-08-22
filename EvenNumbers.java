import java.util.Scanner;
public class EvenNumbers {
     public static void main(String[] args) {
         System.out.println("Enter the first number: ");
         Scanner scanner = new Scanner(System.in);
         int a = scanner.nextInt();
         System.out.println("Enter the second number ");
         int b = scanner.nextInt();
          if (a < b) {
              for (int i = a; i <= b; i++) {
                  if (i % 2 == 0) {
                      System.out.println("Even number: " + i);
                  }
              }
          } else {
            System.out.println("First number >= second");
        }
    }
}