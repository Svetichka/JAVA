
import java.util.Scanner;
public class Summa2 {
    public static void main(String[] args) {
       System.out.println("Enter integer number A");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Enter integer B");
        int b = scanner.nextInt();
        int sum = 0;
        if (a < b) {
            for (int i = a; i <=b; i++) {
                sum = sum + i;
            }
            System.out.println("sum =  " + sum);
        }else{
            System.out.println("sum is not present");
        }
    }
}

