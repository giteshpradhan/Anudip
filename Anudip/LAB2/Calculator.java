public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum1 = calc.add(5, 10);
        int sum2 = calc.add(2, 3, 4);
        double sum3 = calc.add(4.5, 3.5);

        System.out.println("Sum of 2 ints: " + sum1);
        System.out.println("Sum of 3 ints: " + sum2);
        System.out.println("Sum of 2 doubles: " + sum3);
    }
}
