import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[][] matrix1 = new Integer[2][2];
        Integer[][] matrix2 = new Integer[2][2];
        Integer[][] result = new Integer[2][2];

        System.out.println("Enter elements of first 2x2 matrix:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                matrix1[i][j] = sc.nextInt();

        System.out.println("Enter elements of second 2x2 matrix:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                matrix2[i][j] = sc.nextInt();

        System.out.println("Resultant Matrix after Addition:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
