import java.util.Scanner;
public class Ugadajka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        int L = 1;
        int R = 100;
        System.out.println(" If number anymore - Enter > ");
        System.out.println(" If number less than  - Enter < ");
        System.out.println(" numbers coincided - Enter = ");
        answer = "tekst";
        while (!"=".equals(answer)) {
            int secret = (int) Math.floor(L + R) / 2;
            System.out.println("Your number is " + secret + "?");
            answer = scanner.next();
            if (">".equals(answer)) {
                L = secret;
            } else {
                if ("<".equals(answer)) {
                    R = secret;
                }
            }
            if ("=".equals(answer)) {
                System.out.println(" Plan number is " + secret);
                break;
            }
        }
    }
}