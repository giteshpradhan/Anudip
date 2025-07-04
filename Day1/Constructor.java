abstract class Cons {
    Cons() {
        System.out.println("This is Constructor");
    }

    abstract void run();
    abstract void fly();
}
class Demo extends Cons {
    
    Demo() {
        System.out.println("This is child class constructor");
    }
    public void run() {
        System.out.println("This is method for run");
    }

    public void fly() {
        System.out.println("This is method for fly");
    }
}

public class MainClass {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.fly();
        d1.run();
    }
}
