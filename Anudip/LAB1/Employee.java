public class Employee {
    protected int id;
    protected int age;
    protected String name;
    protected boolean isPermanent;

    public static void main(String[] args) {
        Employee emp = new Employee();

        // Error: incompatible types: possible lossy conversion from double to int
        // emp.age = 35.5;

        // Correct by casting
        emp.age = (int) 35.5;

        System.out.println("Successfully started");
    }
}