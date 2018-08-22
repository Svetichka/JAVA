import java.util.Scanner;
    public class Uravnenie
    {
        public static void main(String[] args) {
            System.out.println("Введите коэффициент A ");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            System.out.println("Введите коэффициент B ");
            int b = scanner.nextInt();
            System.out.println("Введите коэффициент C ");
            int c = scanner.nextInt();
            double d = b * b - 4 * a * c;
            System.out.println("Дискриминант = " + d);
            if (d < 0) {
                System.out.println("Корней на множестве действительных чисел нет");
            }
            if (d > 0) {
                double x1 = (-b + Math.sqrt(d)) / 2 * a;
                double x2 = (-b - Math.sqrt(d)) / 2 * a;
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else {
                if (d == 0) {
                    double x = (-b) / 2 * a;
                    System.out.println("x = " + x);
                }
            }
        }
    }


