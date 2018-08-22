import java.util.Random;

public class MaxChange {
    public static void main(String[] args) {
        int[] mas = new int[10];
        int counter = 0;
        int maxNumberIndex = 0;
        int max = 0;
        int change = 0;
        for (int i = 0; i < 10; i++) {
            Random randomGenerator = new Random();
            mas[i] = randomGenerator.nextInt(101);
            counter++;
            if (mas[i] > max) {
                max = mas[i];
                maxNumberIndex = counter;
            }
            System.out.print(mas[i] + ",");
        }
        System.out.println("Max number: " + max);
        System.out.println("Max number index: " + maxNumberIndex);
        mas[maxNumberIndex -1] = mas[0];
        mas[0] = max;
        for (int i = 0; i < 10; i++) {
            System.out.print(mas[i] + ",");
        }
    }
}


