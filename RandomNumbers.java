import java.util.Random;
import java.util.Scanner;
public class RandomNumbers {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int[] mas = new int[10];
         for (int i = 0; i < 10; i++) {
          mas[i] = randomGenerator.nextInt(101);
          System.out.print(mas[i] + ",");
        }
    }
}