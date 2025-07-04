import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.print("Enter basic salary: ");
            double basic = scanner.nextDouble();
            double hra, da;

            if (basic > 15000) {
                hra = 0.20 * basic;
                da = 0.60 * basic;
            } else {
                hra = 3000;
                da = 0.70 * basic;
            }

            double gross = basic + hra + da;
            System.out.println("Gross Salary: " + gross);

            System.out.print("Enter -1 to continue or any other number to exit: ");
            choice = scanner.nextInt();
        } while (choice == -1);
    }
}
