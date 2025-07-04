import java.util.Scanner;

public class Armstrong {
    public static void printArmstrongNumber(int start, int end) {
        for (int num = start; num <= end; num++) {
            int original = num;
            int result = 0;
            int temp = num;

            while (temp != 0) {
                int digit = temp % 10;
                int cube = 1;
                for (int i = 0; i < 3; i++) {
                    cube *= digit;
                }
                result += cube;
                temp /= 10;
            }

            if (result == original) {
                System.out.println(original + " is an Armstrong number");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start of range: ");
        int start = scanner.nextInt();
        System.out.print("Enter end of range: ");
        int end = scanner.nextInt();
        printArmstrongNumber(start, end);
    }
}
