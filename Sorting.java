import java.util.Random;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        int[] mas = new int[10];
        for (int i = 0; i < 10; i++) {
            Random randomGenerator = new Random();
            mas[i] = randomGenerator.nextInt(101);
        }
        for (int i = mas.length - 1; i > 0; i--) {
            for (int k = 0; k < i; k++) {

                if (mas[k] > mas[k + 1]) {
                    int sohr = mas[k];
                    mas[k] = mas[k + 1];
                    mas[k + 1] = sohr;
                }
            }
        }
        System.out.println("Thank you!");
        System.out.print("Assorted array of numbers : ");
        for (int x : mas) {
            System.out.print(x);
            System.out.print(",");
        }
    }
}

