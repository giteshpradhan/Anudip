import java.util.Scanner;

public class OddEvenCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oddCount = 0, evenCount = 0;

        while (true) {
            System.out.print("Enter a number (-1 to stop): ");
            int num = scanner.nextInt();

            if (num == -1) {
                break;
            }

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);
    }
}
