import java.util.Random;

public class Array3DOperations {
    public static void main(String[] args) {
        int[][][] array = new int[3][3][3];
        Random rand = new Random();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int count = 0;

        System.out.println("3D Array Elements:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    array[i][j][k] = rand.nextInt(100);
                    System.out.print(array[i][j][k] + " ");
                    sum += array[i][j][k];
                    count++;
                    if (array[i][j][k] > max) {
                        max = array[i][j][k];
                    }
                }
                System.out.println();
            }
            System.out.println();
        }

        double average = (double) sum / count;
        System.out.println("Maximum value: " + max);
        System.out.println("Average of all elements: " + average);
    }
}
