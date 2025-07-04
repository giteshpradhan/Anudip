class Student {
    String name;
    int age;
    String department;

    public Student() {
        this.name = "Unknown";
        this.age = 20;
        this.department = "Unassigned";
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.department = "IT";
    }

    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Department: " + department);
    }
}

public class MainStudentLab {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("John", 22);
        Student s3 = new Student("Alice", 21, "CSE");

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
